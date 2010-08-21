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
package org.dlw.ai.blackboard;

import java.util.concurrent.ConcurrentLinkedQueue;

import org.dlw.ai.blackboard.domain.Assumption;

/**
 * <p>
 * This class is used as an attribute addition (extention) that defines the
 * implemented {@link org.dlw.ai.blackboard.knowledge.KnowledgeSource}(s) in
 * package {@link org.dlw.ai.blackboard.knowledge.primitive}.
 * </p>
 * 
 * <p>
 * This class is not extendable and therefore not part of the API. Its use is
 * specific to the problem domain being solved by
 * {@link org.dlw.ai.blackboard.Main}.
 * </p>
 * 
 * @author dlwhitehurst
 * 
 */
public class BlackboardContext {

    /**
     * Attribute blackboard
     */
    private Blackboard blackboard;

    /**
     * Attribute controller
     */
    private Controller controller;

    /**
     * Attribute queue of assumptions made by KnowledgeSource
     */
    private ConcurrentLinkedQueue<Assumption> pastAssumptions;

    /**
     * Default constructor
     */
    public BlackboardContext() {
    }

    /**
     * Loaded constructor
     * 
     * @param blackboard
     * @param controller
     * @param pastAssumptions
     */
    public BlackboardContext(Blackboard blackboard, Controller controller,
            ConcurrentLinkedQueue<Assumption> pastAssumptions) {
        this.blackboard = blackboard;
        this.controller = controller;
        this.pastAssumptions = pastAssumptions;
    }

    /**
     * @return the blackboard
     */
    public final Blackboard getBlackboard() {
        return blackboard;
    }

    /**
     * @param blackboard
     *            the blackboard to set
     */
    public final void setBlackboard(Blackboard blackboard) {
        this.blackboard = blackboard;
    }

    /**
     * @return the controller
     */
    public final Controller getController() {
        return controller;
    }

    /**
     * @param controller
     *            the controller to set
     */
    public final void setController(Controller controller) {
        this.controller = controller;
    }

    /**
     * @return the pastAssumptions
     */
    public final ConcurrentLinkedQueue<Assumption> getPastAssumptions() {
        return pastAssumptions;
    }

    /**
     * @param pastAssumptions
     *            the pastAssumptions to set
     */
    public final void setPastAssumptions(
            ConcurrentLinkedQueue<Assumption> pastAssumptions) {
        this.pastAssumptions = pastAssumptions;
    }

}
