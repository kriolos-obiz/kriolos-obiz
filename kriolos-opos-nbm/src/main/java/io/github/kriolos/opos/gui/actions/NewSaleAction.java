/*
 * Copyright (C) 2022 Paulo Borges
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.kriolos.opos.gui.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "KriolosPOS",
        id = "io.github.kriolos.opos.gui.actions.NewSaleAction"
)
@ActionRegistration(
        iconBase = "io/github/kriolos/opos/gui/icons/app_logo.png", // Required: Toolbar buttons must have an icon path (16x16)
        displayName = "#CTL_NewSaleAction"
)
@ActionReference(
        path = "Toolbars/KriolosPOS", // Matches the folder name read by your PosToolbarConfig.xml
        position = 100 // Lower numbers place the button further to the left
)
@Messages("CTL_NewSaleAction=New Sale (F2)")
public final class NewSaleAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // Place your Point of Sale business logic here (e.g., open sales screen)
    }
}
