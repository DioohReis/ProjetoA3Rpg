/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo.tela.metodo;

import javax.swing.JOptionPane;

import jogo.tela.CriacaoDePersonagem;

public class VerificarClasse {

    public <T> void verificarClasse(T classeGenerica, CriacaoDePersonagem cp) {

        if (classeGenerica != null) {
            String valor = classeGenerica.toString();
            if (!valor.equalsIgnoreCase("Sem classe") && !valor.equalsIgnoreCase("")) {

                switch (valor.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe1 está como Arqueiro
                        cp.getCb_arqueiro().setVisible(true);
                        cp.getCb_arqueiro().setEnabled(true);
                        cp.getLbl_dano().setVisible(true);
                        cp.getCob_hp().setVisible(true);

                        break;

                    case "assassino":
                        // Verificar se a classe1 está como Assassino

                        cp.getCb_assassino().setVisible(true);
                        cp.getCb_assassino().setEnabled(true);
                        cp.getLbl_dano().setVisible(true);
                        cp.getCob_hp().setVisible(true);

                        break;
                    case "bardo":
                        // Verificar se a classe1 está como Bardo
                        cp.getCb_bardo().setVisible(true);
                        cp.getCb_bardo().setEnabled(true);
                        cp.getLbl_dano().setVisible(true);
                        cp.getCob_hp().setVisible(true);
                        break;

                    case "guerreiro":
                        // Verificar se a classe1 está como Guerreiro
                        cp.getCb_guerreiro().setVisible(true);
                        cp.getCb_guerreiro().setEnabled(true);
                        cp.getLbl_dano().setVisible(true);
                        cp.getCob_hp().setVisible(true);
                        break;
                    case "mago":
                        // Verificar se a classe1 está como Mago
                        cp.getCb_mago().setVisible(true);
                        cp.getCb_mago().setEnabled(true);
                        cp.getLbl_dano().setVisible(true);
                        cp.getCob_hp().setVisible(true);
                        break;
                    default:
                        // Caso a classe1 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 1 com classe inválida");
                        break;

                }
            }

        }

    }


}