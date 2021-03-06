/*
 * Copyright 2016 Finn Bock
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.bckfnn.taggersty;

/**
 * Output interface for taggersty.
 */
public interface TagsOutput {

    /**
     * Emit a String.
     * @param s the value
     */
    public void write(String s);

    /**
     * Emit a char array.
     * @param s the value
     */
    public void write(char[] s);


    /**
     * Emit a single character.
     * @param c the value
     */
    public void write(char c);

    /**
     * Flush the accumulated output.
     */
    public void flush();

    /**
     * Close the output.
     */
    public void close();


}
