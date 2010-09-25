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

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <p>
 * This class is used to model the Word object. This object is used as a data
 * structure that best represents a word. This class can be extended and might
 * be used for other design scenarios outside of the default implementation of
 * the blackboard model here with this project.
 * </p>
 * 
 * <blockquote><i>Word - "(def.) a single distinct meaningful element of speech
 * or writing, used with others (or sometimes alone) to form a sentence and
 * typically shown with a space on either side when written or
 * printed."</i></blockquote>
 * 
 * @author <a href="mailto:dlwhitehurst@gmail.com">David L. Whitehurst</a>
 * @version 1.0.0-RC
 * 
 */
public class Word extends BlackboardObject {

    /**
     * List of cipher letters that make up this ciphered word
     */
    private List<CipherLetter> letters = new ArrayList<CipherLetter>();

    /**
     * The string word
     */
    private String word;

    /**
     * Default constructor
     */
    @SuppressWarnings("unused")
    private Word() {
    }

    /**
     * Loaded constructor
     * 
     * @param word
     */
    public Word(final String word) {
        this.word = word;
    }

    /**
     * Public method to return the value or the string word
     * 
     * @return
     */
    public String value() {
        return word;
    }

    /**
     * Public method to determine if the word has been solved
     * 
     * @return
     */
    public boolean isSolved() {

        /**
         * Always use a local result
         */
        boolean result = false;

        /**
         * No. of true occurrences
         */
        int countTrue = 0;

        /**
         * Iterate over all letters, be sure there is an assertion for each
         */
        List<CipherLetter> list = this.getLetters();
        int count = list.size();

        for (CipherLetter letter : list) {
            Stack<Assumption> stack = letter.getAffirmation().getStatements();
            for (int i = 0; i < stack.size(); i++) {
                Assumption assumption = stack.pop();
                if (!assumption.isRetractable()) {
                    countTrue++;
                }
            }
        }

        /**
         * If the no. of true occurrences equals the no. of letters it's solved
         */
        if (count == countTrue) {
            result = true;
        }

        return result;
    }

    /**
     * Public setter for list of cipher letters
     * 
     * @param letters
     */
    public void setLetters(List<CipherLetter> letters) {
        this.letters = letters;
    }

    /**
     * Public getter for list of cipher letters
     * 
     * @return
     */
    public List<CipherLetter> getLetters() {
        return letters;
    }

    @Override
    public void notifyDependents() {
        // TODO Auto-generated method stub

    }

}
