package org.bflow.toolbox.vc.diagram.edit.commands;

/******************************************************************************
 * Copyright (c) 2004, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/


import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;


/**
 * A command to set the bounds (location/size) of a <code>View</code>
 * 
 * @author melaasar
 */
public class MySetBoundsCommand extends AbstractTransactionalCommand {

	private IAdaptable  adapter;
	private Point location;
	private Dimension size;
	
	/**
	 * Creates a <code>SetBoundsCommand</code> for the given view adapter with a given bounds.
	 * 
     * @param editingDomain
     *            the editing domain through which model changes are made
	 * @param label The command label
	 * @param adapter An adapter to the <code>View</code>
	 * @param bounds The new bounds
	 */
	public MySetBoundsCommand(TransactionalEditingDomain editingDomain, String label,IAdaptable adapter, Rectangle bounds) {
        super(editingDomain, label, null);
		Assert.isNotNull(adapter, "view cannot be null"); //$NON-NLS-1$
		Assert.isNotNull(bounds, "bounds cannot be null"); //$NON-NLS-1$
		this.adapter = adapter;
		this.location = bounds.getLocation();
		this.size = bounds.getSize();
	}
	
	/**
	 * Creates a <code>SetBoundsCommand</code> for the given view adapter with a given location.
	 * 
     * @param editingDomain
     *            the editing domain through which model changes are made
	 * @param label The command label
	 * @param adapter An adapter to the <code>View</code>
	 * @param location The new location
	 */
	public MySetBoundsCommand (TransactionalEditingDomain editingDomain, String label,IAdaptable adapter, Point location) {
        super(editingDomain, label, null);
		Assert.isNotNull(adapter, "view cannot be null"); //$NON-NLS-1$
		Assert.isNotNull(location, "location cannot be null"); //$NON-NLS-1$
		this.adapter = adapter;
		this.location = location;
	}

	/**
	 * Creates a <code>SetBoundsCommand</code> for the given view adapter with a given size.
	 * 
     * @param editingDomain
     *            the editing domain through which model changes are made
	 * @param label The command label
	 * @param adapter An adapter to the <code>View</code>
	 * @param size The new size
	 */
	public MySetBoundsCommand (TransactionalEditingDomain editingDomain, String label, IAdaptable adapter, Dimension size) {
		super(editingDomain, label, null);
        Assert.isNotNull(adapter, "view cannot be null"); //$NON-NLS-1$
		Assert.isNotNull(size, "size cannot be null"); //$NON-NLS-1$
		this.adapter = adapter;
		this.size = size;
	}

	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
	    throws ExecutionException {

		if (adapter == null)
			return CommandResult.newErrorCommandResult("SetBoundsCommand: viewAdapter does not adapt to IView.class"); //$NON-NLS-1$
		
		View view  = (View)adapter.getAdapter(View.class);		
		EObject nodeimpl = (EObject)view.getElement();
		
		location.x = location.x-50;
		location.y = location.y-25;
		
		
		if (location != null) {
			ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getLocation_X(), new Integer(location.x));
			ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getLocation_Y(), new Integer(location.y));
		}
		if (size != null) {
			ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getSize_Width(), new Integer(size.width));
			ViewUtil.setStructuralFeatureValue(view,NotationPackage.eINSTANCE.getSize_Height(), new Integer(size.height));
		}
		return CommandResult.newOKCommandResult();
	}
    
    public List getAffectedFiles() {
        if (adapter != null) {
            View view = (View) adapter.getAdapter(View.class);
            if (view != null) {
                return getWorkspaceFiles(view);
            }
        }
        return super.getAffectedFiles();
    }
}
