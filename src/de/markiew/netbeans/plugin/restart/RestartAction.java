package de.markiew.netbeans.plugin.restart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.LifecycleManager;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(category = "File",
id = "de.markiew.netbeans.plugin.restart.RestartAction")
@ActionRegistration(displayName = "#CTL_RestartAction")
@ActionReferences({
    @ActionReference(path = "Menu/File", position = 2550, separatorAfter = 2575)
})
@Messages("CTL_RestartAction=Restart IDE")
/**
 * Restarts the IDE using the default LifecycleManager.
 */
public final class RestartAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        LifecycleManager.getDefault().markForRestart();
        LifecycleManager.getDefault().exit();
    }
}
