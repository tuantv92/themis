package com.themis.rbac.entity;

import java.util.Collection;

import com.themis.rbac.Grantee;
import com.themis.rbac.Permission;

public interface RBACRole extends Grantee {

	Collection<Permission> getPermissions();
}
