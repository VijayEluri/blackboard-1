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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

import org.dlw.ai.blackboard.rule.Rule;

/**
 * @author <a href="mailto:dlwhitehurst@gmail.com">David L. Whitehurst</a>
 *
 */
@Entity
@Table(name="antecedent")
public class Antecedent extends BaseObject {
    
    /**
     * unique serial identifier
     */
    private static final long serialVersionUID = 2299632874123077597L;
    
    private Long id;
    
    
    /**
     * Attribute parent
     */
    private Rule antecedentRule;

    private String fullyQualifiedClass;
    
    private String methodName;
    
    private String basic;
    
    

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

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean equals(Object o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the antecedentRule
     */
    @OneToOne
    public Rule getAntecedentRule() {
        return antecedentRule;
    }

    /**
     * @param antecedentRule the antecedentRule to set
     */
    public void setAntecedentRule(Rule antecedentRule) {
        this.antecedentRule = antecedentRule;
    }




}
