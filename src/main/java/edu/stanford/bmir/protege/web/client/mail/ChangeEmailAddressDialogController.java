package edu.stanford.bmir.protege.web.client.mail;

import com.google.common.base.Optional;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.Widget;
import edu.stanford.bmir.protege.web.client.library.dlg.HasRequestFocus;
import edu.stanford.bmir.protege.web.client.library.dlg.WebProtegeOKCancelDialogController;
import edu.stanford.bmir.protege.web.shared.user.EmailAddress;

import javax.annotation.Nonnull;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 06/11/2013
 */
public class ChangeEmailAddressDialogController extends WebProtegeOKCancelDialogController<Optional<EmailAddress>> {

    private EmailAddressEditor emailAddressEditor;

    public ChangeEmailAddressDialogController() {
        super("Change email address");
        emailAddressEditor = new EmailAddressEditorImpl();
    }

    @Override
    public Widget getWidget() {
        return emailAddressEditor.asWidget();
    }

    public void setValue(EmailAddress emailAddress) {
        emailAddressEditor.setValue(emailAddress);
    }

    @Nonnull
    @Override
    public java.util.Optional<HasRequestFocus> getInitialFocusable() {
        return emailAddressEditor.getInitialFocusable();
    }

    @Override
    public Optional<EmailAddress> getData() {
        return emailAddressEditor.getValue();
    }
}
