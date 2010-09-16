/**
 * Copyright 2010 David L. Whitehurst
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
package org.dlw.ai.blackboard.domain;

/**
 * @author dlwhitehurst
 *
 */
public class Antecedent {
    
    protected String fullyQualifiedClass;
    
    protected String methodName;
    
    protected String basic;
    

    /**
     * @return the fullyQualifiedClass
     */
    public String getFullyQualifiedClass() {
        return fullyQualifiedClass;
    }

    /**
     * @param fullyQualifiedClass the fullyQualifiedClass to set
     */
    public void setFullyQualifiedClass(String fullyQualifiedClass) {
        this.fullyQualifiedClass = fullyQualifiedClass;
    }

    /**
     * @return the methodName
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * @param methodName the methodName to set
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * @return the basic
     */
    public String getBasic() {
        return basic;
    }

    /**
     * @param basic the basic to set
     */
    public void setBasic(String basic) {
        this.basic = basic;
    }

}
