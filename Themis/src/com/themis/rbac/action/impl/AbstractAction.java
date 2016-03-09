package com.themis.rbac.action.impl;

import com.themis.rbac.Action;
import com.themis.rbac.Grantee;
import com.themis.rbac.PermissionManager;

public abstract class AbstractAction implements Action {

	private final PermissionManager permissionManager;

	public AbstractAction(PermissionManager manager) {
		this.permissionManager = manager;
	}

	@Override
	public PermissionManager getPermissionManager() {
		return this.permissionManager;
	}

	public final void execute(Grantee grantee) {
		if (this.isPermitted(grantee)) {
			this._execute(grantee);
		}
	}

	protected abstract void _execute(Grantee grantee);
}
