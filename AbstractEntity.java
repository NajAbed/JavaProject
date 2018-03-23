/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenfurniture;

/**
 *
 * @author najmeh
 */

import java.io.Serializable;

public abstract class AbstractEntity<T> implements Serializable, Comparable<T> {

	private static final long serialVersionUID = -3909778405524286996L;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
