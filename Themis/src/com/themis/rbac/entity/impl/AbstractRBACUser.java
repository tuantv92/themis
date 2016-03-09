package com.themis.rbac.entity.impl;

import java.util.Collection;
import java.util.HashSet;

import com.themis.rbac.entity.RBACRole;
import com.themis.rbac.entity.RBACUser;

public class AbstractRBACUser implements RBACUser {

	private final Collection<RBACRole> roles = new HashSet<>();

	@Override
	public Collection<RBACRole> getRoles() {
		return this.roles;
	}

}
