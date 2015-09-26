/*
 * The MIT License
 *
 * Copyright (c) 2015 Bruno P. Kinoshita, BioUno
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.biouno.drmaa.pbs;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang.NotImplementedException;
import org.ggf.drmaa.DrmaaException;
import org.ggf.drmaa.JobInfo;
import org.ggf.drmaa.JobTemplate;
import org.ggf.drmaa.Session;
import org.ggf.drmaa.Version;

/**
 * <p>
 * A PBS DRMAA {#link Session}.
 * </p>
 * <p>
 * TODO: example code
 * </p>
 *
 * @author Bruno P. Kinoshita
 * @since 0.1
 */
public class PbsSession implements Session {

    /*
     * --- constants
     */
    private static final String DRM_SYSTEM = "PBS";

    private static final Version DRM_VERSION = new Version(1, 0);

    private static final Logger LOGGER = Logger.getLogger(PbsSession.class.getName());

    /*
     * --- member attributes
     */
    private String contact;

    public PbsSession() {
        super();
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST, "Created a new instance of PbsSession");
        }
    }

    /*
     * --- spec methods
     */

    /*
     * (non-Javadoc)
     * @see org.ggf.drmaa.Session#control(java.lang.String, int)
     */
    @Override
    public void control(String arg0, int arg1) throws DrmaaException {
        throw new NotImplementedException();
    }

    @Override
    public JobTemplate createJobTemplate() throws DrmaaException {
        throw new NotImplementedException();
    }

    @Override
    public void deleteJobTemplate(JobTemplate arg0) throws DrmaaException {
        throw new NotImplementedException();
    }

    @Override
    public void exit() throws DrmaaException {
        throw new NotImplementedException();
    }

    @Override
    public String getContact() {
        return this.contact;
    }

    @Override
    public String getDrmSystem() {
        return DRM_SYSTEM;
    }

    @Override
    public String getDrmaaImplementation() {
        return getDrmSystem();
    }

    @Override
    public int getJobProgramStatus(String arg0) throws DrmaaException {
        throw new NotImplementedException();
    }

    @Override
    public Version getVersion() {
        return DRM_VERSION;
    }

    @Override
    public void init(String contact) throws DrmaaException {
        this.contact = contact;
    }

    @SuppressWarnings("rawtypes")              // from the DRMAA impl
    @Override
    public List runBulkJobs(JobTemplate arg0, int arg1, int arg2, int arg3) throws DrmaaException {
        throw new NotImplementedException();
    }

    @Override
    public String runJob(JobTemplate arg0) throws DrmaaException {
        throw new NotImplementedException();
    }

    @SuppressWarnings("rawtypes")             // from the DRMAA impl
    @Override
    public void synchronize(List arg0, long arg1, boolean arg2) throws DrmaaException {
        throw new NotImplementedException();
    }

    @Override
    public JobInfo wait(String arg0, long arg1) throws DrmaaException {
        throw new NotImplementedException();
    }

}
