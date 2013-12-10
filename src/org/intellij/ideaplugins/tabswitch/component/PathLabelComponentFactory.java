package org.intellij.ideaplugins.tabswitch.component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.jetbrains.annotations.NotNull;

class PathLabelComponentFactory {

  @NotNull
  JLabel create() {
    JLabel pathLabel = new JLabel("");
    pathLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    pathLabel.setFont(pathLabel.getFont().deriveFont((float) 10));
    return pathLabel;
  }
}