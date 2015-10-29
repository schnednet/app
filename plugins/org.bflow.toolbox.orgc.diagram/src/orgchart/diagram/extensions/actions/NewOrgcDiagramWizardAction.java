package orgchart.diagram.extensions.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Implements the IWorkbenchWindowActionDelegate to call the new orgc diagram
 * wizard
 * 
 * @author MArkus Schnädelbach
 * 
 */
public class NewOrgcDiagramWizardAction implements
		IWorkbenchWindowActionDelegate {
	
	private IWorkbenchWindow workbenchWindow;

	@Override
	public void dispose() {
	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.workbenchWindow = window;
	}

	@Override
	public void run(IAction action) {
		System.out.println("TEWST");

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
