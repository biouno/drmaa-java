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

import java.io.Serializable;
import java.util.Map;

import org.ggf.drmaa.DrmaaException;
import org.ggf.drmaa.JobInfo;

/**
 * Represents a job submitted to a batch server. Implements the DRMAA {#link JobInfo} interface.
 *
 * @author Bruno P. Kinoshita
 * @since 0.1
 */
public class Job implements JobInfo, Serializable {

    /*
     * serial version UID.
     */
    private static final long serialVersionUID = 1151164764489337488L;

    @Override
    public String getJobId() throws DrmaaException {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressWarnings("rawtypes")  // from the DRMAA impl
    @Override
    public Map getResourceUsage() throws DrmaaException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasExited() throws DrmaaException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getExitStatus() throws DrmaaException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean hasSignaled() throws DrmaaException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getTerminatingSignal() throws DrmaaException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean hasCoreDump() throws DrmaaException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean wasAborted() throws DrmaaException {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * --- XStream code for de/serialization
     */

}
