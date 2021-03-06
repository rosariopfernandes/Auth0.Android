/*
 * ParameterizableRequest.java
 *
 * Copyright (c) 2015 Auth0 (http://auth0.com)
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

package com.auth0.android.request;

import com.auth0.android.Auth0Exception;

import java.util.Map;

/**
 * Defines a request that can be configured (payload and headers)
 *
 * @param <T> the type this request will return on success.
 * @param <U> the {@link Auth0Exception} type this request will return on failure.
 */
public interface ParameterizableRequest<T, U extends Auth0Exception> extends Request<T, U> {

    /**
     * Add parameters to the request as a Map of Object with the keys as String
     *
     * @param parameters to send with the request
     * @return itself
     */
    ParameterizableRequest<T, U> addParameters(Map<String, Object> parameters);

    /**
     * Add parameter to the request with a given name
     *
     * @param name  of the parameter
     * @param value of the parameter
     * @return itself
     */
    ParameterizableRequest<T, U> addParameter(String name, Object value);

    /**
     * Adds an additional header for the request
     *
     * @param name  of the header
     * @param value of the header
     * @return itself
     */
    ParameterizableRequest<T, U> addHeader(String name, String value);

}
