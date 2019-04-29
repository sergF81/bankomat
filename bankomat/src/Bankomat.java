
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bankomat extends JFrame {
    public static int result_obmena;
    public static int vvod = 0;
    public static String summa = "";
    public static String summa_vvod = "";
    public static int vibor = 0;

    public Bankomat() {
        super("Банкомат Сбербанк");
        JPanel panelbankomata = new JPanel();
        panelbankomata.setLayout((LayoutManager)null);
        Font BigFontTR = new Font("TimesRoman", 1, 9);
        final JButton RUB_vhod = new JButton("RUB");
        RUB_vhod.setFont(BigFontTR);
        RUB_vhod.setOpaque(false);
        RUB_vhod.setBounds(140, 385, 100, 23);
        RUB_vhod.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(RUB_vhod);
        final JButton USD_vhod = new JButton("USD");
        USD_vhod.setFont(BigFontTR);
        USD_vhod.setOpaque(false);
        USD_vhod.setBounds(140, 415, 100, 23);
        USD_vhod.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(USD_vhod);
        final JButton EUR_vhod = new JButton("EUR");
        EUR_vhod.setFont(BigFontTR);
        EUR_vhod.setOpaque(false);
        EUR_vhod.setBounds(140, 445, 100, 23);
        EUR_vhod.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(EUR_vhod);
        final JButton key_yes = new JButton("Y");
        key_yes.setFont(BigFontTR);
        key_yes.setVisible(false);
        key_yes.setOpaque(false);
        key_yes.setBounds(345, 385, 45, 23);
        key_yes.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_yes);
        final JButton key_no = new JButton("N");
        key_no.setFont(BigFontTR);
        key_no.setVisible(false);
        key_no.setOpaque(false);
        key_no.setBounds(345, 415, 45, 23);
        key_no.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_no);
        final JLabel info_pole = new JLabel("Введите валюту, которую хотите обменять");
        info_pole.setFont(BigFontTR);
        info_pole.setBounds(138, 316, 254, 35);
        info_pole.setOpaque(true);
        info_pole.setPreferredSize(new Dimension(200, 100));
        panelbankomata.add(info_pole);
        final JLabel pole_summa = new JLabel();
        pole_summa.setVisible(false);
        pole_summa.setBounds(145, 343, 247, 35);
        pole_summa.setOpaque(true);
        pole_summa.setPreferredSize(new Dimension(200, 100));
        panelbankomata.add(pole_summa);
        JLabel l2 = new JLabel("");
        l2.setBounds(138, 316, 254, 155);
        l2.setOpaque(true);
        l2.setPreferredSize(new Dimension(200, 100));
        panelbankomata.add(l2);
        JButton key_1 = new JButton("");
        key_1.setFont(BigFontTR);
        key_1.setBorderPainted(false);
        key_1.setOpaque(false);
        key_1.setBounds(200, 605, 22, 18);
        key_1.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_1);
        JButton key_2 = new JButton("");
        key_2.setFont(BigFontTR);
        key_2.setBorderPainted(false);
        key_2.setOpaque(false);
        key_2.setBounds(225, 605, 22, 18);
        key_2.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_2);
        JButton key_3 = new JButton("");
        key_3.setFont(BigFontTR);
        key_3.setBorderPainted(false);
        key_3.setOpaque(false);
        key_3.setBounds(248, 605, 22, 18);
        key_3.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_3);
        JButton key_4 = new JButton("");
        key_4.setFont(BigFontTR);
        key_4.setBorderPainted(false);
        key_4.setOpaque(false);
        key_4.setBounds(198, 622, 22, 16);
        key_4.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_4);
        JButton key_5 = new JButton("");
        key_5.setFont(BigFontTR);
        key_5.setBorderPainted(false);
        key_5.setOpaque(false);
        key_5.setBounds(223, 622, 22, 16);
        key_5.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_5);
        JButton key_6 = new JButton("");
        key_6.setFont(BigFontTR);
        key_6.setBorderPainted(false);
        key_6.setOpaque(false);
        key_6.setBounds(248, 622, 22, 16);
        key_6.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_6);
        JButton key_7 = new JButton("");
        key_7.setFont(BigFontTR);
        key_7.setBorderPainted(false);
        key_7.setOpaque(false);
        key_7.setBounds(196, 640, 22, 16);
        key_7.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_7);
        JButton key_8 = new JButton("");
        key_8.setFont(BigFontTR);
        key_8.setBorderPainted(false);
        key_8.setOpaque(false);
        key_8.setBounds(221, 640, 22, 16);
        key_8.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_8);
        JButton key_9 = new JButton("");
        key_9.setFont(BigFontTR);
        key_9.setBorderPainted(false);
        key_9.setOpaque(false);
        key_9.setBounds(246, 640, 22, 16);
        key_9.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_9);
        JButton key_0 = new JButton("");
        key_0.setFont(BigFontTR);
        key_0.setBorderPainted(false);
        key_0.setOpaque(false);
        key_0.setBounds(218, 659, 22, 16);
        key_0.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_0);
        final JButton key_Cancel = new JButton("");
        key_Cancel.setFont(BigFontTR);
        key_Cancel.setBorderPainted(false);
        key_Cancel.setOpaque(false);
        key_Cancel.setBounds(285, 605, 40, 16);
        key_Cancel.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_Cancel);
        final JButton key_reset = new JButton("");
        key_reset.setFont(BigFontTR);
        key_reset.setBorderPainted(false);
        key_reset.setOpaque(false);
        key_reset.setBounds(283, 622, 40, 16);
        key_reset.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_reset);
        final JButton key_enter = new JButton("");
        key_enter.setFont(BigFontTR);
        key_enter.setBorderPainted(false);
        key_enter.setOpaque(false);
        key_enter.setBounds(281, 659, 40, 16);
        key_enter.setBackground(Color.LIGHT_GRAY);
        panelbankomata.add(key_enter);
        key_yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Bankomat.vvod == 0) {
                    info_pole.setText("<html>Вы совершили обмен: Купили " + obrabotka.obrabotka_yes(Bankomat.result_obmena, Bankomat.summa_vvod) + ". <p>Хотите обменять еще? Введите \"y\" если согласны, \"n\" для отмены. </html>");
                    ++Bankomat.vvod;
                } else {
                    Bankomat.summa = "";
                    pole_summa.setText(Bankomat.summa);
                    info_pole.setText("Введите валюту, которую хотите обменять");
                    RUB_vhod.setVisible(true);
                    USD_vhod.setVisible(true);
                    EUR_vhod.setVisible(true);
                    pole_summa.setVisible(false);
                    Bankomat.vvod = 0;
                    key_yes.setVisible(false);
                    key_no.setVisible(false);
                }

            }
        });
        key_no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Bankomat.vvod == 0) {
                    Bankomat.summa = "";
                    pole_summa.setText(Bankomat.summa);
                    info_pole.setText("Введите валюту, которую хотите обменять");
                    RUB_vhod.setVisible(true);
                    USD_vhod.setVisible(true);
                    EUR_vhod.setVisible(true);
                    pole_summa.setVisible(false);
                    Bankomat.vvod = 0;
                    key_yes.setVisible(false);
                    key_no.setVisible(false);
                } else {
                    info_pole.setText("Операция обмена завершена!");
                    RUB_vhod.setVisible(false);
                    USD_vhod.setVisible(false);
                    EUR_vhod.setVisible(false);
                    pole_summa.setVisible(false);
                    key_yes.setVisible(false);
                    key_no.setVisible(false);
                    key_Cancel.setVisible(false);
                    key_reset.setVisible(false);
                    key_enter.setVisible(false);
                }

            }
        });
        key_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "1";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "2";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "3";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "4";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "5";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "6";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "7";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "8";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "9";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = Bankomat.summa + "0";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_Cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = "";
                pole_summa.setText(Bankomat.summa);
                info_pole.setText("Введите валюту, которую хотите обменять");
                RUB_vhod.setVisible(true);
                USD_vhod.setVisible(true);
                EUR_vhod.setVisible(true);
                pole_summa.setVisible(false);
                key_yes.setVisible(false);
                key_no.setVisible(false);
                Bankomat.vvod = 0;
            }
        });
        key_reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Bankomat.summa = "";
                pole_summa.setText(Bankomat.summa);
            }
        });
        key_enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Bankomat.summa != "" && Bankomat.summa != "0") {
                    pole_summa.setText(Bankomat.summa);
                    info_pole.setText("Введите валюту для обмена");
                    RUB_vhod.setVisible(true);
                    USD_vhod.setVisible(true);
                    EUR_vhod.setVisible(true);
                    pole_summa.setVisible(false);
                    Bankomat.summa_vvod = Bankomat.summa;
                } else if (Bankomat.vvod == 0) {
                    Bankomat.summa = "";
                    pole_summa.setText(Bankomat.summa);
                    info_pole.setText("Введите валюту, которую хотите обменять");
                    RUB_vhod.setVisible(true);
                    USD_vhod.setVisible(true);
                    EUR_vhod.setVisible(true);
                    pole_summa.setVisible(false);
                    Bankomat.vvod = 0;
                } else {
                    info_pole.setText("Введите сумму:");
                }

            }
        });
        RUB_vhod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Bankomat.vvod == 0) {
                    info_pole.setText("Введите сумму: ");
                    Bankomat.summa = "";
                    RUB_vhod.setVisible(false);
                    USD_vhod.setVisible(false);
                    EUR_vhod.setVisible(false);
                    pole_summa.setVisible(true);
                    pole_summa.setText(Bankomat.summa);
                    key_enter.setVisible(true);
                    ++Bankomat.vvod;
                    Bankomat.vibor = 1;
                    System.out.println(Bankomat.vibor);
                } else {
                    Bankomat.vvod = 0;
                    RUB_vhod.setVisible(false);
                    USD_vhod.setVisible(false);
                    EUR_vhod.setVisible(false);
                    pole_summa.setVisible(false);
                    if (obrabotka.obraborka_rub(Bankomat.vibor, Bankomat.summa_vvod) != "1") {
                        info_pole.setText("<html>Вы действительно хотите купить" + obrabotka.obraborka_rub(Bankomat.vibor, Bankomat.summa_vvod) + " ? <p>Введите \"y\" если согласны, \"n\" для отмены.");
                        key_yes.setVisible(true);
                        key_no.setVisible(true);
                        key_enter.setVisible(false);
                        key_enter.setVisible(false);
                        System.out.println(Bankomat.summa_vvod);
                    } else {
                        info_pole.setText("Нельзя валюту менять саму на себя.");
                        key_enter.setVisible(false);
                    }
                }

            }
        });
        USD_vhod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Bankomat.vvod == 0) {
                    info_pole.setText("Введите сумму: ");
                    Bankomat.summa = "";
                    RUB_vhod.setVisible(false);
                    USD_vhod.setVisible(false);
                    EUR_vhod.setVisible(false);
                    pole_summa.setVisible(true);
                    pole_summa.setText(Bankomat.summa);
                    key_enter.setVisible(true);
                    ++Bankomat.vvod;
                    Bankomat.vibor = 2;
                } else {
                    Bankomat.vvod = 0;
                    RUB_vhod.setVisible(false);
                    USD_vhod.setVisible(false);
                    EUR_vhod.setVisible(false);
                    pole_summa.setVisible(false);
                    if (obrabotka.obraborka_usd(Bankomat.vibor, Bankomat.summa_vvod) != "1") {
                        info_pole.setText("<html>Вы действительно хотите купить" + obrabotka.obraborka_usd(Bankomat.vibor, Bankomat.summa_vvod) + " ? <p>Введите \"y\" если согласны, \"n\" для отмены.");
                        key_yes.setVisible(true);
                        key_no.setVisible(true);
                        key_enter.setVisible(false);
                        System.out.println(obrabotka.obraborka_usd(Bankomat.vibor, Bankomat.summa_vvod));
                    } else {
                        Bankomat.summa = "";
                        info_pole.setText("Нельзя валюту менять саму на себя.");
                        key_enter.setVisible(false);
                    }
                }

            }
        });
        EUR_vhod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Bankomat.vvod == 0) {
                    info_pole.setText("Введите сумму: ");
                    Bankomat.summa = "";
                    RUB_vhod.setVisible(false);
                    USD_vhod.setVisible(false);
                    EUR_vhod.setVisible(false);
                    pole_summa.setVisible(true);
                    pole_summa.setText(Bankomat.summa);
                    key_enter.setVisible(true);
                    ++Bankomat.vvod;
                    Bankomat.vibor = 3;
                } else {
                    Bankomat.vvod = 0;
                    RUB_vhod.setVisible(false);
                    USD_vhod.setVisible(false);
                    EUR_vhod.setVisible(false);
                    pole_summa.setVisible(false);
                    if (obrabotka.obraborka_eur(Bankomat.vibor, Bankomat.summa_vvod) != "1") {
                        info_pole.setText("<html>Вы действительно хотите купить" + obrabotka.obraborka_eur(Bankomat.vibor, Bankomat.summa_vvod) + " ? <p>Введите \"y\" если согласны, \"n\" для отмены.");
                        key_yes.setVisible(true);
                        key_no.setVisible(true);
                        key_enter.setVisible(false);
                    } else {
                        info_pole.setText("Нельзя валюту менять саму на себя.");
                        key_enter.setVisible(false);
                    }
                }

            }
        });
        JLabel background = new JLabel(new ImageIcon(Bankomat.class.getResource("bankomat.jpg")));
        background.setBounds(0, 0, 690, 727);
        panelbankomata.add(background);
        this.setContentPane(panelbankomata);
        this.setPreferredSize(new Dimension(690, 727));
    }

    public static void main(String[] args) {
        Bankomat frame = new Bankomat();
        frame.pack();
        frame.setLocationRelativeTo((Component)null);
        frame.setVisible(true);
    }
}
