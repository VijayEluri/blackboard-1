/**
 * Copyright 2010-2014 David L. Whitehurst
 *
 * Licensed under the Apache License, Version 2.0
 * (the "License"); You may not use this file except
 * in compliance with the License. You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 *
 */
package org.dlw.ai.blackboard.exception;

/**
 * @author <a href="mailto:dlwhitehurst@gmail.com">David L. Whitehurst</a>
 * @version 1.0.0
 */
public class UnknownKnowledgeSourceException extends RuntimeException {

    /**
     * unique serial identifier
     */
    private static final long serialVersionUID = 149080732424351103L;
    
    /**
     * Constructor
     * @param err
     *    the String error message
     */
    public UnknownKnowledgeSourceException(String err) {
        super(err);
    }

}
