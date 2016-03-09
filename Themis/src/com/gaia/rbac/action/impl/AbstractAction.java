package com.gaia.rbac.action.impl;

import com.gaia.rbac.Action;
import com.gaia.rbac.Grantee;
import com.gaia.rbac.PermissionManager;

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
