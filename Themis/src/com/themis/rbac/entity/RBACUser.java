package com.themis.rbac.entity;

import java.util.Collection;

import com.themis.rbac.Grantee;

public interface RBACUser extends Grantee {

	Collection<RBACRole> getRoles();
}
