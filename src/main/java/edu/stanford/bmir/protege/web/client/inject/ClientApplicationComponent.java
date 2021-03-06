package edu.stanford.bmir.protege.web.client.inject;

import com.google.gwt.place.shared.PlaceHistoryHandler;
import dagger.Component;
import edu.stanford.bmir.protege.web.client.app.ApplicationPresenter;
import edu.stanford.bmir.protege.web.client.app.WebProtegeInitializer;
import edu.stanford.bmir.protege.web.client.place.WebProtegeActivityManager;
import edu.stanford.bmir.protege.web.client.portlet.PortletFactoryModuleGenerated;
import edu.stanford.bmir.protege.web.shared.inject.SharedApplicationModule;

import javax.inject.Singleton;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 17/12/15
 */
@Component(
        modules = {
                ClientApplicationModule.class,
                SharedApplicationModule.class,
                PortletFactoryModuleGenerated.class})
@Singleton
public interface ClientApplicationComponent {

    WebProtegeInitializer getWebProtegeInitializer();

    ApplicationPresenter getApplicationPresenter();

    WebProtegeActivityManager getActivityManager();

    PlaceHistoryHandler getPlaceHistoryHandler();

    ClientProjectComponent getClientProjectComponent(ClientProjectModule projectModule);
}
