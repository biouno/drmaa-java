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

import org.ggf.drmaa.DrmaaException;
import org.ggf.drmaa.JobInfo;
import org.ggf.drmaa.JobTemplate;
import org.ggf.drmaa.Session;
import org.ggf.drmaa.Version;

/**
 * A PBS DRMAA {#link Session}.
 *
 * TODO: example code
 *
 * @author Bruno P. Kinoshita
 * @since 0.1
 */
public class PbsSession implements Session {

    @Override
    public void control(String arg0, int arg1) throws DrmaaException {
        // TODO Auto-generated method stub

    }

    @Override
    public JobTemplate createJobTemplate() throws DrmaaException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteJobTemplate(JobTemplate arg0) throws DrmaaException {
        // TODO Auto-generated method stub

    }

    @Override
    public void exit() throws DrmaaException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getContact() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDrmSystem() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDrmaaImplementation() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getJobProgramStatus(String arg0) throws DrmaaException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Version getVersion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init(String arg0) throws DrmaaException {
        // TODO Auto-generated method stub

    }

    @SuppressWarnings("rawtypes") // from the DRMAA spec
    @Override
    public List runBulkJobs(JobTemplate arg0, int arg1, int arg2, int arg3) throws DrmaaException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String runJob(JobTemplate arg0) throws DrmaaException {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressWarnings("rawtypes") // from the DRMAA spec
    @Override
    public void synchronize(List arg0, long arg1, boolean arg2) throws DrmaaException {
        // TODO Auto-generated method stub

    }

    @Override
    public JobInfo wait(String arg0, long arg1) throws DrmaaException {
        // TODO Auto-generated method stub
        return null;
    }

}
