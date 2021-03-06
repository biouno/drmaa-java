This project provides a Java implementation of the [DRMAA](http://www.drmaa.org/) specification. It provides a thin layer around command line executables as `qsub` and `qstat`. Users can choose to run these commands in the same computer where the Java code is being executed, or run them via SSH. The SSH support is provided by the [XebiaLabs overthere library](https://github.com/xebialabs/overthere), which means that some of its features a propagated tot he library (e.g. SSH [jump stations](https://en.wikipedia.org/wiki/Jump_server) support).

A look at [pbs-java-api](https://github.com/biouno/pbs-java-api) and [drmaa-pbs](https://github.com/biouno/drmaa-pbs) may be helpful to understand how and why this API was created. pbs-java-api was the first created, in order to be used in the [PBS Plug-in](https://github.com/biouno/pbs-plugin) for Jenkins. Later users requested that the plug-in supported other batch servers, and then we decided to use the drmaa-pbs as a test bed implementation. This is the result API, based on the work done and tested in the past.

## Basic usage

(WIP)

### Using with PBS Torque

(WIP)

### Using with PBS Pro

(WIP)

### Using with SGE

(WIP)

### Using with SLURM

(WIP)

### Using with LoadLeveler

(WIP)

### Using with LSF

(WIP)

### Using with Univa Grid Engine

(WIP)

### Using with a custom Java driver

(WIP) - see Service Loader in 52North SOS

## Development

To build the project, you can use Maven.

```
mvn clean test install
```

Please, consider uploading your test results to [CJAN.org](http://cjan.org) as well.

### Parsing XML files

The XML files are parsed with [XStream](http://x-stream.github.io/). There is an important class, XmlFile, that is inspired from the [class with the same name, from the Jenkins project](https://github.com/jenkinsci/jenkins/blob/e2dccc35572b64f5e602a6b1b3efb517c578872c/core/src/main/java/hudson/XmlFile.java).

### Connecting to servers

Connection to server is handled by [XebiaLabs' overthere library](https://github.com/xebialabs/overthere). The type of connection (SSH, local, scp, su) is decided based on the contact string, passed in the Session#init method. This method has the same signature as defined in the [DRMAA](http://drmaa.org) reference implementation, though we use the contact string with a different purpose.

### Logging

Logging is done via JUL. TODO: explain how to customise log levels, output, etc
