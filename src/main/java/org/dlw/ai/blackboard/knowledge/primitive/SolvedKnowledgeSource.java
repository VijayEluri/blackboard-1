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
package org.dlw.ai.blackboard.knowledge.primitive;

import java.util.ArrayList;

import org.dlw.ai.blackboard.domain.Sentence;
import org.dlw.ai.blackboard.knowledge.InferenceEngine;
import org.dlw.ai.blackboard.knowledge.KnowledgeSourceConstants;
import org.dlw.ai.blackboard.knowledge.KnowledgeSourceUtil;
import org.dlw.ai.blackboard.rule.Rule;
import org.dlw.ai.blackboard.util.MessageConstants;

/**
 * @author <a href="mailto:dlwhitehurst@gmail.com">David L. Whitehurst</a>
 * @version 1.0.0-RC
 * 
 */
public class SolvedKnowledgeSource extends SentenceKnowledgeSource implements
        InferenceEngine {

    /**
     * unique serial identifier
     */
    private static final long serialVersionUID = -7129896322940388384L;
    
    private ArrayList<Rule> rules = new ArrayList<Rule>();
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((rules == null) ? 0 : rules.hashCode());
        return result;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        SolvedKnowledgeSource other = (SolvedKnowledgeSource) obj;
        if (rules == null) {
            if (other.rules != null)
                return false;
        } else if (!rules.equals(other.rules))
            return false;
        return true;
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.dlw.ai.blackboard.knowledge.SentenceKnowledgeSource#toString()
     */
    @Override
    public String toString() {
        return KnowledgeSourceConstants.SOLVED_KNOWLEDGE_SOURCE;
    }

    /* (non-Javadoc)
     * @see org.dlw.ai.blackboard.knowledge.primitive.SentenceKnowledgeSource#reset()
     */
    @Override
    public void reset() {
        // TODO Auto-generated method stub
        super.reset();
    }

    /* (non-Javadoc)
     * @see org.dlw.ai.blackboard.knowledge.primitive.SentenceKnowledgeSource#evaluate(org.dlw.ai.blackboard.domain.Sentence)
     */
    @Override
    public void evaluate(Sentence sentence) {
        KnowledgeSourceUtil.considerRules(this, sentence, MessageConstants.SENTENCE_SOLVED, "");
    }

}    
