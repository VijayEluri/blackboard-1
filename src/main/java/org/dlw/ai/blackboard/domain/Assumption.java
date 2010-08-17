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
 * <p>
 * The {@link Assumption} class is a retractable statement made about a
 * particular domain object that may or may not be true. The mediator or
 * {@link org.dlw.ai.blackboard.Cryptographer} at the {@link org.dlw.ai.blackboard.Blackboard} 
 * problem solving session may chose to table or locally keep these assumptions until 
 * an {@link Assertion} or non-retractable Assumption can be made or placed on the
 * {@link org.dlw.ai.blackboard.Blackboard} visual.</p>
 * 
 * <blockquote><i>Assumption -"(def.) a statement that is accepted as true
 * or as certain to happen, without proof " ... Oxford American Dictionary</i></blockquote>
 * 
 * @author dlwhitehurst
 * 
 */
public class Assumption extends BlackboardObject {

	/**
	 * Domain object definition, <i>never</i> set as constant. This object attribute
	 * is very important to our understanding, knowledge, intelligence, etc. because it
	 * answers the question "what is it?". And, how do our senses perceive this 
	 * impression (image, sound, thought, experience, smell, touch, etc.)? Therefore,
	 * this impression(s) is different for each individual.  Webster, Oxford, and or any
	 * other dictionary provides a definition for us that provides a baseline 
	 * impression for our <i>knowledge</i>if we seek this impression and <i>definition</i>
	 * for our own understanding.
	 */
	protected String def;
	
	/**
	 * Assumption is always retractable. Please note that an Assertion (extends)
	 * is not retractable and therefore overrides this method and returns false
	 * 
	 * @return true (always)
	 */
	public boolean isRetractable() {
		return true;
	}

	/**
	 * @return the def
	 */
	public String getDef() {
		return def;
	}

	/**
	 * @param def the def to set
	 */
	public void setDef(String def) {
		this.def = def;
	}

	public void notifyParticipants() {
		// TODO Auto-generated method stub
		
	}


}
