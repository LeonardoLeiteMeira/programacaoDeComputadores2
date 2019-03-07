package GUI;

import Arquivos.Arquivos;
import Animalia.Anfibio;
import Animalia.Animal;
import Animalia.Ave;
import Animalia.Mamifero;
import Animalia.Peixe;
import Animalia.Reptil;
import Excptions.JaulaLotadaException;
import Zoo.Secao;
import java.awt.CardLayout;
import java.awt.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Zoologico extends javax.swing.JFrame {
    
    private String especie;
    private String nome;
    private String genero;
    private String categoria;
    private Anfibio anfibio;
    private Ave ave;
    private Mamifero mamifero;
    private Peixe peixe;
    private Reptil reptil;
    private Secao[] secoes;//tinha q ser HashMap
    private int maxAnimais = 10;//aqui eu levei em consideração que todas as seçoes tem a msm capacidade;
    private Arquivos gerenciador;
    
    public void constroiSecoes(){
        secoes = new Secao[5];
        secoes[0] = new Secao("Anfíbio",maxAnimais);
        secoes[1] = new Secao("Ave",maxAnimais);
        secoes[2] = new Secao("Peixe",maxAnimais);
        secoes[3] = new Secao("Réptil",maxAnimais);
        secoes[4] = new Secao("Mamífero",maxAnimais);
    }
    public Zoologico() {
        initComponents();
        constroiSecoes();
        gerenciador = new Arquivos();
        secoes = (Secao []) gerenciador.LeObjeto("zoologico.ser");
        atualizapaginaPrincipal();
        
    }
    public void atualizaNomeListasAnimais(){
        mainMamifero.setText("Mamíferos ("+secoes[4].getNumAnimais()+"):");
        mainAnfibio.setText("Anfíbios ("+secoes[0].getNumAnimais()+"):");
        mainAve.setText("Aves ("+secoes[1].getNumAnimais()+"):");
        mainRepteis.setText("Répteis ("+secoes[3].getNumAnimais()+"):");
        mainPeixe.setText("Peixes ("+secoes[2].getNumAnimais()+"):");
    }
    public void atualizapaginaPrincipal(){
        listaMamiferos.removeAll();//limpa a lista para colocar so os novos dados
        listaPeixes.removeAll();
        listaAves.removeAll();
        listaRepteis.removeAll();
        listaAnfibios.removeAll();     
        atualizaNomeListasAnimais();
        int i;
        
        for(i=0; i<secoes.length;i++){
            switch(secoes[i].getInfo()){
                case "Mamífero":
                    for(Animal animal: secoes[i].getAnimais())//percorre o arrayList e escreve os nome dos animais
                        addNaLista(listaMamiferos,animal);
                    break;
                    
                case "Peixe":
                    for(Animal animal: secoes[i].getAnimais())//percorre o arrayList e escreve os nome dos animais
                        addNaLista(listaPeixes,animal);
                    break;
                    
                    
                case "Ave":
                    for(Animal animal: secoes[i].getAnimais())//percorre o arrayList e escreve os nome dos animais
                        addNaLista(listaAves,animal);
                    break;
                    
                case "Réptil":
                    for(Animal animal: secoes[i].getAnimais())//percorre o arrayList e escreve os nome dos animais
                        addNaLista(listaRepteis,animal);
                    break;
                    
                case "Anfíbio":
                    for(Animal animal: secoes[i].getAnimais())//percorre o arrayList e escreve os nome dos animais
                        addNaLista(listaAnfibios,animal);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar a página principal", "ERRO", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    public void addNaLista(List lista, Animal animal){
        lista.add(animal.getName());
    }
    public void iniciaZoo() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zoologico().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardLayout = new javax.swing.JPanel();
        principal = new javax.swing.JPanel();
        mainMamifero = new javax.swing.JLabel();
        mainAnfibio = new javax.swing.JLabel();
        mainAve = new javax.swing.JLabel();
        mainRepteis = new javax.swing.JLabel();
        mainPeixe = new javax.swing.JLabel();
        listaMamiferos = new java.awt.List();
        listaAnfibios = new java.awt.List();
        listaAves = new java.awt.List();
        listaRepteis = new java.awt.List();
        listaPeixes = new java.awt.List();
        jLabel18 = new javax.swing.JLabel();
        addAnimal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboEspecie = new javax.swing.JComboBox<>();
        comboGenero = new javax.swing.JComboBox<>();
        textoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoADD = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        removeAnimal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textoNome2 = new javax.swing.JTextField();
        comboEspecie2 = new javax.swing.JComboBox<>();
        botaoRemover2 = new javax.swing.JButton();
        botaoLimpar2 = new javax.swing.JButton();
        info = new javax.swing.JPanel();
        textoInfo = new javax.swing.JTextArea();
        menuBotoes = new javax.swing.JPanel();
        botaoPrincipal = new javax.swing.JButton();
        botaoAdicionar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoInfo = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        painelNome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zoologico");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(859, 460));

        cardLayout.setLayout(new java.awt.CardLayout());

        mainMamifero.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\16\\elephant-head.png")); // NOI18N
        mainMamifero.setText("Mamiferos:");

        mainAnfibio.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\16\\turtle.png")); // NOI18N
        mainAnfibio.setText("Anfibios");

        mainAve.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\16\\bird.png")); // NOI18N
        mainAve.setText("Aves:");

        mainRepteis.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\16\\chameleon-head.png")); // NOI18N
        mainRepteis.setText("Répteis:");

        mainPeixe.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\16\\big-salmon.png")); // NOI18N
        mainPeixe.setText("Peixes:");

        listaMamiferos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaMamiferos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaMamiferosActionPerformed(evt);
            }
        });

        listaAnfibios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaAnfibios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAnfibiosActionPerformed(evt);
            }
        });

        listaAves.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaAves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAvesActionPerformed(evt);
            }
        });

        listaRepteis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaRepteis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaRepteisActionPerformed(evt);
            }
        });

        listaPeixes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaPeixes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPeixesActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setText("Nosso Zoologico hoje conta conta com (5) seções de animais, Mamíferos, Anfibios, Aves, Répteis e Peixes.");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaMamiferos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainMamifero, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaAnfibios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainAnfibio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaAves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainAve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaRepteis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainRepteis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addComponent(listaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        principalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {listaAnfibios, listaAves, listaMamiferos, listaPeixes, listaRepteis});

        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainMamifero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainAnfibio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainAve, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainRepteis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPeixe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaRepteis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaAves, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaAnfibios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaMamiferos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(listaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );

        cardLayout.add(principal, "principal");

        jLabel5.setText("Qual a especie do Animal?");

        jLabel6.setText("Qual o nome do Animal?");

        jLabel7.setText("Qual o gênero do Animal?");

        comboEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Anfíbio", "Ave", "Peixe", "Réptil", "Mamífero" }));
        comboEspecie.setSelectedIndex(0);

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Macho", "Fêmea", "Hermafrodita" }));
        comboGenero.setSelectedIndex(0);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Informe os dados do animal que será adicionado:");

        botaoADD.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\tick.png")); // NOI18N
        botaoADD.setText("Adicionar");
        botaoADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoADDActionPerformed(evt);
            }
        });

        botaoLimpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\16\\mop-tool-to-clean-floors.png")); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addAnimalLayout = new javax.swing.GroupLayout(addAnimal);
        addAnimal.setLayout(addAnimalLayout);
        addAnimalLayout.setHorizontalGroup(
            addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAnimalLayout.createSequentialGroup()
                .addGroup(addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addAnimalLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(addAnimalLayout.createSequentialGroup()
                                    .addComponent(botaoADD, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(54, 54, 54))
                                .addGroup(addAnimalLayout.createSequentialGroup()
                                    .addGroup(addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(167, 167, 167)
                                    .addGroup(addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(addAnimalLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        addAnimalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoADD, botaoLimpar});

        addAnimalLayout.setVerticalGroup(
            addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addAnimalLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addAnimalLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoADD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cardLayout.add(addAnimal, "adicionar");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Informe os dados do animal a ser removido");

        jLabel10.setText("Qual o tipo do Animal?");

        jLabel11.setText("Qual o nome do Animal?");

        comboEspecie2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Anfíbio", "Ave", "Peixe", "Réptil", "Mamífero" }));
        comboEspecie2.setSelectedIndex(0);

        botaoRemover2.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\tick.png")); // NOI18N
        botaoRemover2.setText("Remover");
        botaoRemover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemover2ActionPerformed(evt);
            }
        });

        botaoLimpar2.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\16\\mop-tool-to-clean-floors.png")); // NOI18N
        botaoLimpar2.setText("Limpar");
        botaoLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimpar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout removeAnimalLayout = new javax.swing.GroupLayout(removeAnimal);
        removeAnimal.setLayout(removeAnimalLayout);
        removeAnimalLayout.setHorizontalGroup(
            removeAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeAnimalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeAnimalLayout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(removeAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(removeAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(removeAnimalLayout.createSequentialGroup()
                            .addComponent(botaoRemover2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botaoLimpar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55))
                        .addGroup(removeAnimalLayout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(317, 317, 317))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, removeAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboEspecie2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addGap(288, 288, 288))
        );

        removeAnimalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoLimpar2, botaoRemover2});

        removeAnimalLayout.setVerticalGroup(
            removeAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEspecie2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(removeAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRemover2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cardLayout.add(removeAnimal, "remover");

        textoInfo.setEditable(false);
        textoInfo.setColumns(20);
        textoInfo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        textoInfo.setRows(5);
        textoInfo.setText("Esse programa foi desenvolvido como um trabalho da matéria Programação\nde Computadores II pelos alunos Leonardo Leite, Artur Bani, Davi Emediato e\nLucca Miranda, orientados pela professora Luciana Campos ");
        textoInfo.setBorder(null);

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(textoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        cardLayout.add(info, "info");

        botaoPrincipal.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\asterisk_orange.png")); // NOI18N
        botaoPrincipal.setText("Principal");
        botaoPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrincipalActionPerformed(evt);
            }
        });

        botaoAdicionar.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\add.png")); // NOI18N
        botaoAdicionar.setText("Adicionar Animal");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoRemover.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\cancel.png")); // NOI18N
        botaoRemover.setText("Remover Animal");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoInfo.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\information.png")); // NOI18N
        botaoInfo.setText("Informações");
        botaoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInfoActionPerformed(evt);
            }
        });

        botaoSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\door_out.png")); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuBotoesLayout = new javax.swing.GroupLayout(menuBotoes);
        menuBotoes.setLayout(menuBotoesLayout);
        menuBotoesLayout.setHorizontalGroup(
            menuBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoAdicionar, botaoInfo, botaoPrincipal, botaoRemover, botaoSair});

        menuBotoesLayout.setVerticalGroup(
            menuBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botaoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoAdicionar, botaoInfo, botaoPrincipal, botaoRemover, botaoSair});

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\leona\\OneDrive\\Engenharia de Computacao\\Segundo periodo\\Programação 2\\Programas\\ProjetoFinal\\ProjetoFinal\\icones\\24\\pawprint.png")); // NOI18N
        jLabel1.setText("Zoológico CEFET-MG");

        javax.swing.GroupLayout painelNomeLayout = new javax.swing.GroupLayout(painelNome);
        painelNome.setLayout(painelNomeLayout);
        painelNomeLayout.setHorizontalGroup(
            painelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
        painelNomeLayout.setVerticalGroup(
            painelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(painelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(menuBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrincipalActionPerformed
        CardLayout c1 = (CardLayout) cardLayout.getLayout();
        c1.show(cardLayout, "principal");
    }//GEN-LAST:event_botaoPrincipalActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        CardLayout c1 = (CardLayout) cardLayout.getLayout();
        c1.show(cardLayout, "adicionar");
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        CardLayout c1 = (CardLayout) cardLayout.getLayout();
        c1.show(cardLayout, "remover");
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInfoActionPerformed
        CardLayout c1 = (CardLayout) cardLayout.getLayout();
        c1.show(cardLayout, "info");
    }//GEN-LAST:event_botaoInfoActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,"Deseja encerrar o programa?","Confirmar saída", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            gerenciador.EscreveObjeto(secoes, "zoologico.ser");
            System.exit(0);
        }
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoADDActionPerformed
        especie = comboEspecie.getSelectedItem().toString();
        nome = textoNome.getText();
        genero = comboGenero.getSelectedItem().toString();
        
        try{
           if(especie.equals("Anfíbio") && !comboGenero.getSelectedItem().toString().equals("Selecione")){
                anfibio = new Anfibio("Anfíbio", genero, nome);
                secoes[0].recebeAnimal(anfibio);
                JOptionPane.showMessageDialog(null, "Anfíbio adicionado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);   
            }
            else if(especie.equals("Ave") && !comboGenero.getSelectedItem().toString().equals("Selecione")){
                ave = new Ave("Ave", genero, nome);
                secoes[1].recebeAnimal(ave);
                JOptionPane.showMessageDialog(null, "Ave adicionada com sucesso", "", JOptionPane.INFORMATION_MESSAGE);   
            }
            else if(especie.equals("Peixe") && !comboGenero.getSelectedItem().toString().equals("Selecione")){
                peixe = new Peixe("Peixe", genero, nome);
                secoes[2].recebeAnimal(peixe);
                JOptionPane.showMessageDialog(null, "Peixe adicionado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(especie.equals("Réptil") && !comboGenero.getSelectedItem().toString().equals("Selecione")){
                reptil = new Reptil("Réptil", genero, nome);
                secoes[3].recebeAnimal(reptil);
                JOptionPane.showMessageDialog(null, "Réptil adicionado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);   
            }
            else if(especie.equals("Mamífero") && !comboGenero.getSelectedItem().toString().equals("Selecione")){
                mamifero = new Mamifero("Mamífero", genero, nome);
                secoes[4].recebeAnimal(mamifero);
                JOptionPane.showMessageDialog(null, "Mamífero adicionado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);   
            }
            else if(comboEspecie.getSelectedItem().toString().equals("Selecione"))
                JOptionPane.showMessageDialog(null, "Selecione uma espécie", "ERRO", JOptionPane.ERROR_MESSAGE);
            else if(comboGenero.getSelectedItem().toString().equals("Selecione"))
                JOptionPane.showMessageDialog(null, "Selecione um gênero", "ERRO", JOptionPane.ERROR_MESSAGE);
        }catch(JaulaLotadaException e){
            JOptionPane.showMessageDialog(null, "Essa seção já esta cheia!!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        atualizapaginaPrincipal();
        comboEspecie.setSelectedIndex(0);
        comboGenero.setSelectedIndex(0);
        textoNome.setText("");
    }//GEN-LAST:event_botaoADDActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        comboEspecie.setSelectedIndex(0);
        comboGenero.setSelectedIndex(0);
        textoNome.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpar2ActionPerformed
        comboEspecie2.setSelectedIndex(0);
        
        textoNome2.setText("");
    }//GEN-LAST:event_botaoLimpar2ActionPerformed

    private void botaoRemover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemover2ActionPerformed
        especie = comboEspecie2.getSelectedItem().toString();
        nome = textoNome2.getText();
       
        
        if(!nome.equals("")){
            if(especie.equals("Anfíbio")){
                //anfibio = new Anfibio("Anfíbio", genero, nome);
                if(secoes[0].removeAnimal(nome))
                    JOptionPane.showMessageDialog(null, "Anfíbio removido com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Animal inexistente", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(especie.equals("Ave")){
                //ave = new Ave("Ave", genero, nome);
                if(secoes[1].removeAnimal(nome))
                    JOptionPane.showMessageDialog(null, "Ave removida com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Animal inexistente", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(especie.equals("Peixe")){
                //peixe = new Peixe("Peixe", genero, nome);
                if(secoes[2].removeAnimal(nome))
                    JOptionPane.showMessageDialog(null, "Peixe removido com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Animal inexistente", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(especie.equals("Réptil")){
                //reptil = new Reptil("Réptil", genero, nome);
                if(secoes[3].removeAnimal(nome))
                    JOptionPane.showMessageDialog(null, "Réptil removido com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Animal inexistente", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(especie.equals("Mamífero")){
                //mamifero = new Mamifero("Mamífero", genero, nome);
                if(secoes[4].removeAnimal(nome))
                    JOptionPane.showMessageDialog(null, "Mamífero removido com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                else 
                    JOptionPane.showMessageDialog(null, "Animal inexistente", "", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(comboEspecie2.getSelectedItem().toString().equals("Selecione"))
                JOptionPane.showMessageDialog(null, "Selecione uma espécie", "", JOptionPane.ERROR_MESSAGE);   
        }else{
            JOptionPane.showMessageDialog(null, "Informe o nome", "", JOptionPane.ERROR_MESSAGE); 
        }
        atualizapaginaPrincipal();
        comboEspecie2.setSelectedIndex(0);
        textoNome2.setText("");
    }//GEN-LAST:event_botaoRemover2ActionPerformed

    private void listaMamiferosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaMamiferosActionPerformed
        
        for(Animal animal: secoes[4].getAnimais()){
            if(animal.getName().equals(listaMamiferos.getSelectedItem())){
                String texto = "Mamífero: "+ listaMamiferos.getSelectedItem()+", "+ animal.getGender();
                JOptionPane.showMessageDialog(null, texto, "", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_listaMamiferosActionPerformed

    private void listaAnfibiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAnfibiosActionPerformed
        for(Animal animal: secoes[0].getAnimais()){
            if(animal.getName().equals(listaAnfibios.getSelectedItem())){
                String texto = "Anfíbio: "+ listaAnfibios.getSelectedItem()+", "+ animal.getGender();
                JOptionPane.showMessageDialog(null, texto, "", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_listaAnfibiosActionPerformed

    private void listaAvesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAvesActionPerformed
        for(Animal animal: secoes[1].getAnimais()){
            if(animal.getName().equals(listaAves.getSelectedItem())){
                String texto = "Ave: "+ listaAves.getSelectedItem()+", "+ animal.getGender();
                JOptionPane.showMessageDialog(null, texto, "", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_listaAvesActionPerformed

    private void listaRepteisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaRepteisActionPerformed
        for(Animal animal: secoes[3].getAnimais()){
            if(animal.getName().equals(listaRepteis.getSelectedItem())){
                String texto = "Réptil: "+ listaRepteis.getSelectedItem()+", "+ animal.getGender();
                JOptionPane.showMessageDialog(null, texto, "", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_listaRepteisActionPerformed

    private void listaPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPeixesActionPerformed
        for(Animal animal: secoes[2].getAnimais()){
            if(animal.getName().equals(listaPeixes.getSelectedItem())){
                String texto = "Peixe: "+ listaPeixes.getSelectedItem()+", "+ animal.getGender();
                JOptionPane.showMessageDialog(null, texto, "", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_listaPeixesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addAnimal;
    private javax.swing.JButton botaoADD;
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoInfo;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoLimpar2;
    private javax.swing.JButton botaoPrincipal;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoRemover2;
    private javax.swing.JButton botaoSair;
    private javax.swing.JPanel cardLayout;
    private javax.swing.JComboBox<String> comboEspecie;
    private javax.swing.JComboBox<String> comboEspecie2;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private java.awt.List listaAnfibios;
    private java.awt.List listaAves;
    private java.awt.List listaMamiferos;
    private java.awt.List listaPeixes;
    private java.awt.List listaRepteis;
    private javax.swing.JLabel mainAnfibio;
    private javax.swing.JLabel mainAve;
    private javax.swing.JLabel mainMamifero;
    private javax.swing.JLabel mainPeixe;
    private javax.swing.JLabel mainRepteis;
    private javax.swing.JPanel menuBotoes;
    private javax.swing.JPanel painelNome;
    private javax.swing.JPanel principal;
    private javax.swing.JPanel removeAnimal;
    private javax.swing.JTextArea textoInfo;
    private javax.swing.JTextField textoNome;
    private javax.swing.JTextField textoNome2;
    // End of variables declaration//GEN-END:variables
}
