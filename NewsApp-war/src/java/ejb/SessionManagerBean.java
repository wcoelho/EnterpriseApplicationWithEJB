/*
 * Copyright (c) 2019 Walter.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Walter - initial API and implementation and/or initial documentation
 */
package ejb;

import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Walter
 */
@Singleton
@LocalBean
@WebListener
public class SessionManagerBean implements HttpSessionListener
{
    private static int counter = 0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        counter++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        counter--;
    }
    
    public int getActiveSessionsCount() {
        return counter;
    }

}
