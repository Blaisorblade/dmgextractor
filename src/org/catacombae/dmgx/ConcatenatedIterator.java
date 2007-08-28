/*-
 * Copyright (C) 2007 Erik Larsson
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.catacombae.dmgx;

import java.util.*;

public class ConcatenatedIterator<E> implements Iterator<E> {
    private ArrayList<Iterator<E>> sequence = new ArrayList<Iterator<E>>();
    private int index = 0;
    public void add(Iterator<E> next) { sequence.add(next); }

    public boolean hasNext() {
	if(index < sequence.size()) {
	    Iterator<E> curIt = sequence.get(index);
	    while(!curIt.hasNext() && (index+1) < sequence.size())
		curIt = sequence.get(++index);
	    return curIt.hasNext();
	}
	else
	    return false;
    }
    public E next() {
	if(index < sequence.size()) {
	    Iterator<E> curIt = sequence.get(index);
	    while(!curIt.hasNext() && (index+1) < sequence.size())
		curIt = sequence.get(++index);
	    return curIt.next();
	}
	else
	    throw new NoSuchElementException();
	
    }
    public void remove() {
	throw new UnsupportedOperationException();
    }
}