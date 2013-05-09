/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Templater.java
 *
 * Created on Dec 1, 2011, 10:50:08 AM
 */
package com.xtesoft.xtecuannet.framework.templater.gui;

import com.xtesoft.xtecuannet.framework.templater.config.TemplaterConfig;
import com.xtesoft.xtecuannet.framework.templater.constants.Constants;
import com.xtesoft.xtecuannet.framework.templater.filler.*;
import com.xtesoft.xtecuannet.framework.templater.tasks.ResourceCopyCssTask;
import com.xtesoft.xtecuannet.framework.templater.tasks.ResourceCopyImagesTask;
import com.xtesoft.xtecuannet.framework.templater.tasks.ResourceCopyImagesTask1;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.xtecuan.xconfigurator.utils.LoggerUtilPlus;

/**
 *
 * @author xtecuan
 */
public class Templater extends javax.swing.JFrame {

    /**
     * Creates new form Templater
     */
    public Templater() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCrearInterfaces = new javax.swing.JButton();
        buttonCrearImplementaciones = new javax.swing.JButton();
        buttonCrearServicesConfigSpring = new javax.swing.JButton();
        buttonCreateConfigProps = new javax.swing.JButton();
        buttonCrearLog4jConsoleAppenderConfig = new javax.swing.JButton();
        buttonOptimizarPersistenceXml = new javax.swing.JButton();
        buttonCrearFacesConfig = new javax.swing.JButton();
        buttonCrearWebXml = new javax.swing.JButton();
        backingbeansButton = new javax.swing.JButton();
        bundleButton = new javax.swing.JButton();
        buttonRemotingServlet = new javax.swing.JButton();
        buttonClasspathModel = new javax.swing.JButton();
        buttonClasspathWeb = new javax.swing.JButton();
        buttonProjectXmlWeb = new javax.swing.JButton();
        buttonCpImagesDesing = new javax.swing.JButton();
        buttonCss = new javax.swing.JButton();
        buttonPomXmlModel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        buttonCrearInterfaces.setText("Crear Interfaces");
        buttonCrearInterfaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearInterfacesActionPerformed(evt);
            }
        });

        buttonCrearImplementaciones.setText("Crear Implementaciones");
        buttonCrearImplementaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearImplementacionesActionPerformed(evt);
            }
        });

        buttonCrearServicesConfigSpring.setText("Crear Archivo Servicios Springframework");
        buttonCrearServicesConfigSpring.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearServicesConfigSpringActionPerformed(evt);
            }
        });

        buttonCreateConfigProps.setText("Crear configuration.properties");
        buttonCreateConfigProps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateConfigPropsActionPerformed(evt);
            }
        });

        buttonCrearLog4jConsoleAppenderConfig.setText("Crear Log4j ConsoleAppender Config");
        buttonCrearLog4jConsoleAppenderConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearLog4jConsoleAppenderConfigActionPerformed(evt);
            }
        });

        buttonOptimizarPersistenceXml.setText("Optimizar persistence.xml");
        buttonOptimizarPersistenceXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOptimizarPersistenceXmlActionPerformed(evt);
            }
        });

        buttonCrearFacesConfig.setText("Crear faces-config.xml");
        buttonCrearFacesConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearFacesConfigActionPerformed(evt);
            }
        });

        buttonCrearWebXml.setText("Crear web.xml");
        buttonCrearWebXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearWebXmlActionPerformed(evt);
            }
        });

        backingbeansButton.setText("Crear applicationContext-backingbeans.xml");
        backingbeansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backingbeansButtonActionPerformed(evt);
            }
        });

        bundleButton.setText("Crear Bundle.properties");
        bundleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bundleButtonActionPerformed(evt);
            }
        });

        buttonRemotingServlet.setText("Spring Remoting Servlet Config");
        buttonRemotingServlet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemotingServletActionPerformed(evt);
            }
        });

        buttonClasspathModel.setText("Classpath Modelo");
        buttonClasspathModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClasspathModelActionPerformed(evt);
            }
        });

        buttonClasspathWeb.setText("Classpath Web");
        buttonClasspathWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClasspathWebActionPerformed(evt);
            }
        });

        buttonProjectXmlWeb.setText("project.xml Web");
        buttonProjectXmlWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProjectXmlWebActionPerformed(evt);
            }
        });

        buttonCpImagesDesing.setText("Copiar Imagenes a carpeta Web");
        buttonCpImagesDesing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCpImagesDesingActionPerformed(evt);
            }
        });

        buttonCss.setText("Copiar CSS a carpeta Web");
        buttonCss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCssActionPerformed(evt);
            }
        });

        buttonPomXmlModel.setText("Agregar dependencias a pom.xml (Model)");
        buttonPomXmlModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPomXmlModelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCrearInterfaces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonOptimizarPersistenceXml)
                    .addComponent(buttonCrearLog4jConsoleAppenderConfig)
                    .addComponent(buttonCreateConfigProps)
                    .addComponent(buttonCrearServicesConfigSpring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCrearImplementaciones)
                    .addComponent(buttonCrearWebXml, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCrearFacesConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPomXmlModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backingbeansButton, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(bundleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRemotingServlet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonClasspathModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonClasspathWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonProjectXmlWeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCpImagesDesing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonOptimizarPersistenceXml)
                                .addGap(12, 12, 12)
                                .addComponent(buttonCrearInterfaces, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backingbeansButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCrearImplementaciones)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCrearServicesConfigSpring)
                            .addComponent(bundleButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonCreateConfigProps)
                            .addComponent(buttonRemotingServlet))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(buttonCrearLog4jConsoleAppenderConfig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonCrearFacesConfig)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCrearWebXml))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(buttonClasspathModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonClasspathWeb)
                                .addGap(18, 18, 18)
                                .addComponent(buttonProjectXmlWeb)))
                        .addGap(18, 18, 18)
                        .addComponent(buttonCpImagesDesing))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonPomXmlModel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCss)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


        logger.info("Starting application, with config path: " + FilenameUtils.normalize(Constants.getConfig().getBasePath()));
        logger.info(config.getEntitiesPkg());
        logger.info(config.getEntitiesPath());
        logger.info(config.getServicesPath());
        logger.info(config.getServicesPathImpl().getPath());
        logger.info(config.getServicesPkgImpl());


    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        logger.info("Closing Application!!!");
    }//GEN-LAST:event_formWindowClosing

    private void buttonCrearInterfacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearInterfacesActionPerformed
        // TODO add your handling code here:
        config.refreshConfig();
//        JOptionPane.showMessageDialog(this, config.getPathApp());
        new ServiceFiller().filloutTemplate();
    }//GEN-LAST:event_buttonCrearInterfacesActionPerformed

    private void buttonCrearImplementacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearImplementacionesActionPerformed
        // TODO add your handling code here:
        config.refreshConfig();

        new ServiceImplFiller().filloutTemplate();
    }//GEN-LAST:event_buttonCrearImplementacionesActionPerformed

    private void buttonCrearServicesConfigSpringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearServicesConfigSpringActionPerformed
        // TODO add your handling code here:
        config.refreshConfig();

        new SpringServiceXmlConfigFiller().filloutTemplate();
    }//GEN-LAST:event_buttonCrearServicesConfigSpringActionPerformed

    private void buttonCreateConfigPropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateConfigPropsActionPerformed
        // TODO add your handling code here:
        new ConfigurationPropsFiller().filloutTemplate();
    }//GEN-LAST:event_buttonCreateConfigPropsActionPerformed

    private void buttonCrearLog4jConsoleAppenderConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearLog4jConsoleAppenderConfigActionPerformed
        // TODO add your handling code here:
        new Log4jXmlConsoleAppenderFiller().filloutTemplate();
    }//GEN-LAST:event_buttonCrearLog4jConsoleAppenderConfigActionPerformed

    private void buttonOptimizarPersistenceXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOptimizarPersistenceXmlActionPerformed
        // TODO add your handling code here:
        new PersistenceXmlEnhancerFiller().filloutTemplate();
    }//GEN-LAST:event_buttonOptimizarPersistenceXmlActionPerformed

    private void buttonCrearFacesConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearFacesConfigActionPerformed
        // TODO add your handling code here:
        new FacesConfigFiller().filloutTemplate();
    }//GEN-LAST:event_buttonCrearFacesConfigActionPerformed

    private void buttonCrearWebXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearWebXmlActionPerformed
        // TODO add your handling code here:
        logger.info(config.getExposeRemoteSpringServices());
        new WebXmlFiller().filloutTemplate();
    }//GEN-LAST:event_buttonCrearWebXmlActionPerformed

    private void backingbeansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backingbeansButtonActionPerformed
        // TODO add your handling code here:
        new SpringManagedBeansXmlConfigFiller().filloutTemplate();
    }//GEN-LAST:event_backingbeansButtonActionPerformed

    private void bundleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bundleButtonActionPerformed
        // TODO add your handling code here:
        new EmptyBundleFiller().filloutTemplate();
    }//GEN-LAST:event_bundleButtonActionPerformed

    private void buttonRemotingServletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemotingServletActionPerformed
        // TODO add your handling code here:
        new RemotingServletConfigFiller().filloutTemplate();
    }//GEN-LAST:event_buttonRemotingServletActionPerformed

    private void buttonClasspathModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClasspathModelActionPerformed
        // TODO add your handling code here:
        new ProjectModelClasspathFiller().patchProjectProperties();
    }//GEN-LAST:event_buttonClasspathModelActionPerformed

    private void buttonClasspathWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClasspathWebActionPerformed
        // TODO add your handling code here:
        ProjectWebClasspathFiller web = new ProjectWebClasspathFiller();

        web.patchProjectProperties();

    }//GEN-LAST:event_buttonClasspathWebActionPerformed

    private void buttonProjectXmlWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProjectXmlWebActionPerformed
        // TODO add your handling code here:

        new ProjectWebXmlFiller().filloutTemplate();
    }//GEN-LAST:event_buttonProjectXmlWebActionPerformed

    private void buttonCpImagesDesingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCpImagesDesingActionPerformed
        // TODO add your handling code here:
        new ResourceCopyImagesTask().doProcess();
        new ResourceCopyImagesTask1().doProcess();
    }//GEN-LAST:event_buttonCpImagesDesingActionPerformed

    private void buttonCssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCssActionPerformed
        // TODO add your handling code here:
        new ResourceCopyCssTask().doProcess();
    }//GEN-LAST:event_buttonCssActionPerformed

    private void buttonPomXmlModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPomXmlModelActionPerformed
        // TODO add your handling code here:
        new PomXmlModelEnhancerFiller().filloutTemplate();
    }//GEN-LAST:event_buttonPomXmlModelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Templater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Templater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Templater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Templater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Templater().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backingbeansButton;
    private javax.swing.JButton bundleButton;
    private javax.swing.JButton buttonClasspathModel;
    private javax.swing.JButton buttonClasspathWeb;
    private javax.swing.JButton buttonCpImagesDesing;
    private javax.swing.JButton buttonCrearFacesConfig;
    private javax.swing.JButton buttonCrearImplementaciones;
    private javax.swing.JButton buttonCrearInterfaces;
    private javax.swing.JButton buttonCrearLog4jConsoleAppenderConfig;
    private javax.swing.JButton buttonCrearServicesConfigSpring;
    private javax.swing.JButton buttonCrearWebXml;
    private javax.swing.JButton buttonCreateConfigProps;
    private javax.swing.JButton buttonCss;
    private javax.swing.JButton buttonOptimizarPersistenceXml;
    private javax.swing.JButton buttonPomXmlModel;
    private javax.swing.JButton buttonProjectXmlWeb;
    private javax.swing.JButton buttonRemotingServlet;
    // End of variables declaration//GEN-END:variables
    private static final Logger logger = LoggerUtilPlus.getLogger(Templater.class, Constants.LOG_CONFIG);
    private TemplaterConfig config = new TemplaterConfig();
}
