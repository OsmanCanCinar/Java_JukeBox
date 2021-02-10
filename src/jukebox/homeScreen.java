package jukebox;
//  @author osman
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class homeScreen extends javax.swing.JFrame {
    
    mainClass main = new mainClass();
    public static int count;
    public static int muteCnt;
    
    public homeScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        Component [] components = this.getContentPane().getComponents();
        for(Component component : components) {
            if(component instanceof JButton) {
                ((JButton) component).setUI(new BasicButtonUI());
                ((JButton) component).setFocusPainted(false);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bigPanel = new javax.swing.JPanel();
        SplitPane = new javax.swing.JSplitPane();
        MenuSide = new javax.swing.JPanel();
        signature = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        songs_Btn = new javax.swing.JButton();
        playList_Btn = new javax.swing.JButton();
        genres_Btn = new javax.swing.JButton();
        options_Btn = new javax.swing.JButton();
        exit_Btn = new javax.swing.JButton();
        rightSide = new javax.swing.JPanel();
        playerPanel = new javax.swing.JPanel();
        nowPlayinDisplay = new javax.swing.JPanel();
        songDisplay = new javax.swing.JLabel();
        play_Btn = new javax.swing.JLabel();
        repeat_Btn = new javax.swing.JLabel();
        stop_Btn = new javax.swing.JLabel();
        pause_Btn = new javax.swing.JLabel();
        mute_Btn = new javax.swing.JLabel();
        increaseVolume_Btn = new javax.swing.JLabel();
        selectSongButton = new javax.swing.JLabel();
        loopStat = new javax.swing.JLabel();
        decreaseVolume_Btn = new javax.swing.JLabel();
        muteStat = new javax.swing.JLabel();
        pnlCards = new javax.swing.JPanel();
        pnlCard0 = new javax.swing.JPanel();
        welcomePanel = new javax.swing.JPanel();
        homePageLabel = new javax.swing.JLabel();
        greetingLabel1 = new javax.swing.JLabel();
        pnlCard1 = new javax.swing.JPanel();
        bigPane3 = new javax.swing.JPanel();
        page1 = new javax.swing.JLabel();
        genresComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        artistsComboBox = new javax.swing.JComboBox<>();
        songsComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pnlCard2 = new javax.swing.JPanel();
        bigPane2 = new javax.swing.JPanel();
        songNameLabel1 = new javax.swing.JLabel();
        songArtistLabel1 = new javax.swing.JLabel();
        songNameField1 = new javax.swing.JTextField();
        songArtistField1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        playlistDisplay = new javax.swing.JTable();
        removeSong_Btn1 = new javax.swing.JButton();
        addSong_Btn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlCard3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        songListTable = new javax.swing.JTable();
        page3 = new javax.swing.JLabel();
        pnlCard4 = new javax.swing.JPanel();
        bigPane4 = new javax.swing.JPanel();
        songNameLabel = new javax.swing.JLabel();
        songArtistLabel = new javax.swing.JLabel();
        songGenreLabel = new javax.swing.JLabel();
        songPathLabel = new javax.swing.JLabel();
        songNameField = new javax.swing.JTextField();
        songArtistField = new javax.swing.JTextField();
        songGenreField = new javax.swing.JTextField();
        songPathField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        songsFromDb = new javax.swing.JTable();
        removeSong_Btn = new javax.swing.JButton();
        addSong_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bigPanel.setBackground(new java.awt.Color(255, 255, 255));
        bigPanel.setPreferredSize(new java.awt.Dimension(505, 5));
        bigPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplitPane.setBackground(new java.awt.Color(44, 62, 80));
        SplitPane.setForeground(new java.awt.Color(44, 62, 80));

        MenuSide.setBackground(new java.awt.Color(23, 63, 95));
        MenuSide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signature.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        signature.setForeground(new java.awt.Color(200, 200, 200));
        signature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_wing_chair_30px.png"))); // NOI18N
        signature.setText("CAN CINAR DEVELOPMENT");
        MenuSide.add(signature, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 240, 40));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        MenuSide.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 10));

        songs_Btn.setBackground(new java.awt.Color(59, 210, 237));
        songs_Btn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        songs_Btn.setForeground(new java.awt.Color(204, 202, 204));
        songs_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_musical_notes_50px.png"))); // NOI18N
        songs_Btn.setText("Songs");
        songs_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        songs_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songs_BtnActionPerformed(evt);
            }
        });
        MenuSide.add(songs_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 50));

        playList_Btn.setBackground(new java.awt.Color(94, 23, 62));
        playList_Btn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        playList_Btn.setForeground(new java.awt.Color(204, 202, 204));
        playList_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_dj_50px.png"))); // NOI18N
        playList_Btn.setText("Playlist");
        playList_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playList_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playList_BtnActionPerformed(evt);
            }
        });
        MenuSide.add(playList_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, 50));

        genres_Btn.setBackground(new java.awt.Color(23, 94, 73));
        genres_Btn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        genres_Btn.setForeground(new java.awt.Color(204, 204, 204));
        genres_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_color_palette_50px.png"))); // NOI18N
        genres_Btn.setText("Genres");
        genres_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genres_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genres_BtnActionPerformed(evt);
            }
        });
        MenuSide.add(genres_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 220, 50));

        options_Btn.setBackground(new java.awt.Color(249, 135, 50));
        options_Btn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        options_Btn.setForeground(new java.awt.Color(204, 202, 204));
        options_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_circled_menu_40px.png"))); // NOI18N
        options_Btn.setText("Options");
        options_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        options_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                options_BtnActionPerformed(evt);
            }
        });
        MenuSide.add(options_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 220, 50));

        exit_Btn.setBackground(new java.awt.Color(94, 55, 23));
        exit_Btn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        exit_Btn.setForeground(new java.awt.Color(204, 202, 204));
        exit_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_cancel_40px.png"))); // NOI18N
        exit_Btn.setText("Exit");
        exit_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_BtnActionPerformed(evt);
            }
        });
        MenuSide.add(exit_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 220, 50));

        SplitPane.setLeftComponent(MenuSide);

        rightSide.setLayout(new java.awt.BorderLayout());

        playerPanel.setBackground(new java.awt.Color(237, 85, 59));
        playerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nowPlayinDisplay.setBackground(new java.awt.Color(44, 62, 80));

        songDisplay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        songDisplay.setForeground(new java.awt.Color(204, 202, 204));
        songDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout nowPlayinDisplayLayout = new javax.swing.GroupLayout(nowPlayinDisplay);
        nowPlayinDisplay.setLayout(nowPlayinDisplayLayout);
        nowPlayinDisplayLayout.setHorizontalGroup(
            nowPlayinDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nowPlayinDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        nowPlayinDisplayLayout.setVerticalGroup(
            nowPlayinDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nowPlayinDisplayLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(songDisplay)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        playerPanel.add(nowPlayinDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 718, 60));

        play_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        play_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/play.png"))); // NOI18N
        play_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                play_BtnMouseReleased(evt);
            }
        });
        playerPanel.add(play_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 120, 120));

        repeat_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        repeat_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/repeat.png"))); // NOI18N
        repeat_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                repeat_BtnMouseReleased(evt);
            }
        });
        playerPanel.add(repeat_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        stop_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stop_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/stop.png"))); // NOI18N
        stop_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stop_BtnMouseReleased(evt);
            }
        });
        playerPanel.add(stop_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        pause_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pause_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pause.png"))); // NOI18N
        pause_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pause_BtnMouseReleased(evt);
            }
        });
        playerPanel.add(pause_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        mute_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mute_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mute.png"))); // NOI18N
        mute_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mute_BtnMouseReleased(evt);
            }
        });
        playerPanel.add(mute_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        increaseVolume_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        increaseVolume_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/volume_full.png"))); // NOI18N
        increaseVolume_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                increaseVolume_BtnMouseReleased(evt);
            }
        });
        playerPanel.add(increaseVolume_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        selectSongButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/settings.png"))); // NOI18N
        selectSongButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        selectSongButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                selectSongButtonMouseReleased(evt);
            }
        });
        playerPanel.add(selectSongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        loopStat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loopStat.setForeground(new java.awt.Color(204, 202, 204));
        loopStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerPanel.add(loopStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, 20));

        decreaseVolume_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/volume_down.png"))); // NOI18N
        decreaseVolume_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                decreaseVolume_BtnMouseReleased(evt);
            }
        });
        playerPanel.add(decreaseVolume_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        muteStat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        muteStat.setForeground(new java.awt.Color(204, 202, 204));
        muteStat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerPanel.add(muteStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        rightSide.add(playerPanel, java.awt.BorderLayout.PAGE_END);

        pnlCards.setBackground(new java.awt.Color(80, 62, 44));
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlCard0.setBackground(new java.awt.Color(80, 62, 44));
        pnlCard0.setForeground(new java.awt.Color(204, 202, 204));

        welcomePanel.setBackground(new java.awt.Color(44, 62, 80));

        homePageLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        homePageLabel.setForeground(new java.awt.Color(204, 202, 204));
        homePageLabel.setText("Home Page");

        greetingLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        greetingLabel1.setForeground(new java.awt.Color(204, 202, 204));
        greetingLabel1.setText("Welcome ");

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greetingLabel1)
                    .addComponent(homePageLabel))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(homePageLabel)
                .addGap(41, 41, 41)
                .addComponent(greetingLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCard0Layout = new javax.swing.GroupLayout(pnlCard0);
        pnlCard0.setLayout(pnlCard0Layout);
        pnlCard0Layout.setHorizontalGroup(
            pnlCard0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCard0Layout.setVerticalGroup(
            pnlCard0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCard0Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pnlCards.add(pnlCard0, "card6");

        pnlCard1.setBackground(new java.awt.Color(80, 62, 44));

        bigPane3.setBackground(new java.awt.Color(80, 62, 44));

        page1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        page1.setForeground(new java.awt.Color(204, 202, 204));
        page1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page1.setText("Explore & Navigate");

        genresComboBox.setBackground(new java.awt.Color(108, 122, 137));
        genresComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        genresComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genresComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 202, 204));
        jLabel1.setText("Genres");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 202, 204));
        jLabel2.setText("Artists");

        artistsComboBox.setBackground(new java.awt.Color(108, 122, 137));
        artistsComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        artistsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistsComboBoxActionPerformed(evt);
            }
        });

        songsComboBox.setBackground(new java.awt.Color(108, 122, 137));
        songsComboBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        songsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songsComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 202, 204));
        jLabel3.setText("Songs");

        javax.swing.GroupLayout bigPane3Layout = new javax.swing.GroupLayout(bigPane3);
        bigPane3.setLayout(bigPane3Layout);
        bigPane3Layout.setHorizontalGroup(
            bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigPane3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bigPane3Layout.createSequentialGroup()
                        .addComponent(page1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bigPane3Layout.createSequentialGroup()
                        .addGroup(bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(78, 78, 78)
                        .addGroup(bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(artistsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(songsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        bigPane3Layout.setVerticalGroup(
            bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(page1)
                .addGap(28, 28, 28)
                .addGroup(bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(bigPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(artistsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCard1Layout = new javax.swing.GroupLayout(pnlCard1);
        pnlCard1.setLayout(pnlCard1Layout);
        pnlCard1Layout.setHorizontalGroup(
            pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCard1Layout.setVerticalGroup(
            pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlCards.add(pnlCard1, "card2");

        pnlCard2.setBackground(new java.awt.Color(80, 62, 44));

        bigPane2.setBackground(new java.awt.Color(80, 62, 44));

        songNameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songNameLabel1.setForeground(new java.awt.Color(204, 202, 204));
        songNameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songNameLabel1.setText("Song's Name :");

        songArtistLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songArtistLabel1.setForeground(new java.awt.Color(204, 202, 204));
        songArtistLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songArtistLabel1.setText("Song's Artist  :");

        songNameField1.setBackground(new java.awt.Color(108, 122, 137));
        songNameField1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        songNameField1.setForeground(new java.awt.Color(204, 202, 204));

        songArtistField1.setBackground(new java.awt.Color(108, 122, 137));
        songArtistField1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        songArtistField1.setForeground(new java.awt.Color(204, 202, 204));

        playlistDisplay.setBackground(new java.awt.Color(35, 203, 167));
        playlistDisplay.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        playlistDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Artist", "Genre", "Path"
            }
        ));
        playlistDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playlistDisplayMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(playlistDisplay);

        removeSong_Btn1.setBackground(new java.awt.Color(217, 30, 24));
        removeSong_Btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeSong_Btn1.setForeground(new java.awt.Color(204, 202, 204));
        removeSong_Btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_minus_30px.png"))); // NOI18N
        removeSong_Btn1.setText("Remove Song from Playlist");
        removeSong_Btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        removeSong_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSong_Btn1ActionPerformed(evt);
            }
        });

        addSong_Btn1.setBackground(new java.awt.Color(68, 108, 179));
        addSong_Btn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addSong_Btn1.setForeground(new java.awt.Color(204, 202, 204));
        addSong_Btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_plus_30px.png"))); // NOI18N
        addSong_Btn1.setText("Add Song to Playlist");
        addSong_Btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addSong_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSong_Btn1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 202, 204));
        jLabel4.setText("Your Playlist");

        javax.swing.GroupLayout bigPane2Layout = new javax.swing.GroupLayout(bigPane2);
        bigPane2.setLayout(bigPane2Layout);
        bigPane2Layout.setHorizontalGroup(
            bigPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigPane2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(bigPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigPane2Layout.createSequentialGroup()
                        .addGroup(bigPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bigPane2Layout.createSequentialGroup()
                                .addComponent(songArtistLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(songArtistField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bigPane2Layout.createSequentialGroup()
                                .addComponent(songNameLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(songNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(bigPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeSong_Btn1)
                            .addComponent(addSong_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigPane2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(bigPane2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bigPane2Layout.setVerticalGroup(
            bigPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bigPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSong_Btn1)
                    .addComponent(songNameLabel1)
                    .addComponent(songNameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bigPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeSong_Btn1)
                    .addComponent(songArtistLabel1)
                    .addComponent(songArtistField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout pnlCard2Layout = new javax.swing.GroupLayout(pnlCard2);
        pnlCard2.setLayout(pnlCard2Layout);
        pnlCard2Layout.setHorizontalGroup(
            pnlCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCard2Layout.setVerticalGroup(
            pnlCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlCards.add(pnlCard2, "card5");

        pnlCard3.setBackground(new java.awt.Color(80, 62, 44));

        songListTable.setBackground(new java.awt.Color(35, 203, 167));
        songListTable.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        songListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        songListTable.setGridColor(new java.awt.Color(65, 131, 215));
        songListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                songListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(songListTable);

        page3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        page3.setForeground(new java.awt.Color(204, 202, 204));
        page3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        page3.setText("Now Displaying the Database Archive");

        javax.swing.GroupLayout pnlCard3Layout = new javax.swing.GroupLayout(pnlCard3);
        pnlCard3.setLayout(pnlCard3Layout);
        pnlCard3Layout.setHorizontalGroup(
            pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCard3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCard3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(page3)
                .addGap(36, 36, 36))
        );
        pnlCard3Layout.setVerticalGroup(
            pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCard3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(page3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pnlCards.add(pnlCard3, "card2");

        pnlCard4.setBackground(new java.awt.Color(102, 102, 102));

        bigPane4.setBackground(new java.awt.Color(80, 62, 44));

        songNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songNameLabel.setForeground(new java.awt.Color(204, 202, 204));
        songNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songNameLabel.setText("Song's Name :");

        songArtistLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songArtistLabel.setForeground(new java.awt.Color(204, 202, 204));
        songArtistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songArtistLabel.setText("Song's Artist  :");

        songGenreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songGenreLabel.setForeground(new java.awt.Color(204, 202, 204));
        songGenreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songGenreLabel.setText("Song's Genre :");

        songPathLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songPathLabel.setForeground(new java.awt.Color(204, 202, 204));
        songPathLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songPathLabel.setText("Song's Path :");

        songNameField.setBackground(new java.awt.Color(108, 122, 137));
        songNameField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        songNameField.setForeground(new java.awt.Color(204, 202, 204));

        songArtistField.setBackground(new java.awt.Color(108, 122, 137));
        songArtistField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        songArtistField.setForeground(new java.awt.Color(204, 202, 204));

        songGenreField.setBackground(new java.awt.Color(108, 122, 137));
        songGenreField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        songGenreField.setForeground(new java.awt.Color(204, 202, 204));

        songPathField.setBackground(new java.awt.Color(108, 122, 137));
        songPathField.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        songPathField.setForeground(new java.awt.Color(204, 202, 204));

        songsFromDb.setBackground(new java.awt.Color(35, 203, 167));
        songsFromDb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        songsFromDb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Artist", "Genre", "Path"
            }
        ));
        songsFromDb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                songsFromDbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(songsFromDb);

        removeSong_Btn.setBackground(new java.awt.Color(217, 30, 24));
        removeSong_Btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeSong_Btn.setForeground(new java.awt.Color(204, 202, 204));
        removeSong_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_minus_30px.png"))); // NOI18N
        removeSong_Btn.setText("Remove Song from Db");
        removeSong_Btn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        removeSong_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSong_BtnActionPerformed(evt);
            }
        });

        addSong_Btn.setBackground(new java.awt.Color(68, 108, 179));
        addSong_Btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addSong_Btn.setForeground(new java.awt.Color(204, 202, 204));
        addSong_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jukebox.image/icons8_plus_30px.png"))); // NOI18N
        addSong_Btn.setText("Add Song to Db");
        addSong_Btn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        addSong_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSong_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bigPane4Layout = new javax.swing.GroupLayout(bigPane4);
        bigPane4.setLayout(bigPane4Layout);
        bigPane4Layout.setHorizontalGroup(
            bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bigPane4Layout.createSequentialGroup()
                        .addComponent(songNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(songNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bigPane4Layout.createSequentialGroup()
                        .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(songArtistLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(songGenreLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(songPathLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(songGenreField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(songArtistField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(songPathField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addSong_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeSong_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bigPane4Layout.setVerticalGroup(
            bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigPane4Layout.createSequentialGroup()
                .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bigPane4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(bigPane4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(songNameLabel)
                            .addComponent(songNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(songArtistLabel)
                            .addComponent(songArtistField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(songGenreField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(songGenreLabel))
                        .addGap(30, 30, 30)
                        .addGroup(bigPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(songPathField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(songPathLabel))
                        .addGap(18, 18, 18)
                        .addComponent(addSong_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeSong_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout pnlCard4Layout = new javax.swing.GroupLayout(pnlCard4);
        pnlCard4.setLayout(pnlCard4Layout);
        pnlCard4Layout.setHorizontalGroup(
            pnlCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCard4Layout.setVerticalGroup(
            pnlCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bigPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlCards.add(pnlCard4, "card2");

        rightSide.add(pnlCards, java.awt.BorderLayout.CENTER);

        SplitPane.setRightComponent(rightSide);

        bigPanel.add(SplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        getContentPane().add(bigPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genres_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genres_BtnActionPerformed
        pnlCards.removeAll();
        pnlCards.add(pnlCard1);
        pnlCards.repaint();
        pnlCards.revalidate();
        genreCmbx();
    }//GEN-LAST:event_genres_BtnActionPerformed

    private void playList_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playList_BtnActionPerformed
        pnlCards.removeAll();
        pnlCards.add(pnlCard2);
        pnlCards.repaint();
        pnlCards.revalidate();
        displaySongsFromPlaylist();
    }//GEN-LAST:event_playList_BtnActionPerformed

    private void songs_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songs_BtnActionPerformed
        pnlCards.removeAll();
        pnlCards.add(pnlCard3);
        pnlCards.repaint();
        pnlCards.revalidate();
        String query = "SELECT songName FROM `java_songpath`";
        showTableData(query,songListTable); 
    }//GEN-LAST:event_songs_BtnActionPerformed

    private void options_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_options_BtnActionPerformed
        pnlCards.removeAll();
        pnlCards.add(pnlCard4);
        pnlCards.repaint();
        pnlCards.revalidate();
        displaySongs();
    }//GEN-LAST:event_options_BtnActionPerformed

    private void exit_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_BtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_BtnActionPerformed

    private void stop_BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop_BtnMouseReleased
        main.stop();
    }//GEN-LAST:event_stop_BtnMouseReleased

    private void play_BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_BtnMouseReleased
        main.resume();
    }//GEN-LAST:event_play_BtnMouseReleased

    private void pause_BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pause_BtnMouseReleased
        main.pause();
    }//GEN-LAST:event_pause_BtnMouseReleased

    private void selectSongButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectSongButtonMouseReleased
        FileFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3","mpeg3");
        JFileChooser chooser = new JFileChooser("D:\\Downloads\\can\\Music");
        chooser.addChoosableFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            main.stop();
            File myFile = chooser.getSelectedFile();
            String song = myFile + "";
            String name = chooser.getSelectedFile().getName();
            songDisplay.setText(name);
            main.play(song);
        }
    }//GEN-LAST:event_selectSongButtonMouseReleased

    private void repeat_BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeat_BtnMouseReleased
        switch(count) {
            case 0:
                count = 1;
                loopStat.setText("Loop On");
                break;
            case 1:
                count = 0;
                loopStat.setText("Loop Off");
                break;
        }
    }//GEN-LAST:event_repeat_BtnMouseReleased

    private void mute_BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mute_BtnMouseReleased
        switch(muteCnt) {
            case 0:
                muteCnt = 1;
                muteStat.setText("Muted");
                main.volumeControl(0.0);
                break;
            case 1:
                muteCnt = 0;
                muteStat.setText("Unmuted");
                main.volumeControl(0.5);
                break;
        }
    }//GEN-LAST:event_mute_BtnMouseReleased

    private void decreaseVolume_BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decreaseVolume_BtnMouseReleased
        main.volumeDownControl(0.1);
    }//GEN-LAST:event_decreaseVolume_BtnMouseReleased

    private void increaseVolume_BtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_increaseVolume_BtnMouseReleased
       main.volumeUpControl(0.1);
    }//GEN-LAST:event_increaseVolume_BtnMouseReleased

    private void songListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_songListTableMouseClicked
        int songID = songListTable.getSelectedRow() + 2;
        String query = "SELECT songpath, songName FROM `java_songpath` WHERE songId = " + songID;
        PreparedStatement ps;
        ResultSet rs;
        main.stop();
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
                main.play(rs.getString("songPath"));
                songDisplay.setText(rs.getString("songName"));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(signInScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_songListTableMouseClicked

    private void songsFromDbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_songsFromDbMouseClicked
        int i = songsFromDb.getSelectedRow();
        TableModel model = songsFromDb.getModel();
        songNameField.setText(model.getValueAt(i, 0).toString());
        songArtistField.setText(model.getValueAt(i, 1).toString());
        songGenreField.setText(model.getValueAt(i, 2).toString());
        songPathField.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_songsFromDbMouseClicked

    private void addSong_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSong_BtnActionPerformed
        String query = "INSERT INTO `java_songpath`(`songName`, `songArtist`, `songGenre`, `songpath`) VALUES ('" + songNameField.getText()+ "','" + songArtistField.getText() + "','" + songGenreField.getText() + "','" + songPathField.getText() +"')";                                                          
        executeSql(query, "Inserted");
    }//GEN-LAST:event_addSong_BtnActionPerformed

    private void removeSong_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSong_BtnActionPerformed
        String query = "DELETE FROM `java_songpath` WHERE songName ='" + songNameField.getText() +"'";
        executeSql(query, "Removed");
    }//GEN-LAST:event_removeSong_BtnActionPerformed

    private void genresComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genresComboBoxActionPerformed
        String genre = (String) genresComboBox.getSelectedItem();
        bindComboBoxes1(genre);
    }//GEN-LAST:event_genresComboBoxActionPerformed

    private void artistsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistsComboBoxActionPerformed
        String name = (String) artistsComboBox.getSelectedItem();
        bindComboBoxes2(name);
    }//GEN-LAST:event_artistsComboBoxActionPerformed

    private void songsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songsComboBoxActionPerformed
        String name = (String) songsComboBox.getSelectedItem();
        String query = "SELECT songpath, songName FROM `java_songpath` WHERE songName = '"+ name + "'";
        PreparedStatement ps;
        ResultSet rs;
        main.stop();
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
                main.play(rs.getString("songPath"));
                songDisplay.setText(rs.getString("songName"));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(signInScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_songsComboBoxActionPerformed

    private void playlistDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistDisplayMouseClicked
        int i = playlistDisplay.getSelectedRow();
        TableModel model = playlistDisplay.getModel();
        songNameField1.setText(model.getValueAt(i, 0).toString());
        songArtistField1.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_playlistDisplayMouseClicked

    private void addSong_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSong_Btn1ActionPerformed
        
    }//GEN-LAST:event_addSong_Btn1ActionPerformed

    private void removeSong_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSong_Btn1ActionPerformed
        
    }//GEN-LAST:event_removeSong_Btn1ActionPerformed

    public void showTableData(String query, JTable jTable) {
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if(rs.next()) {
                jTable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(signInScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
    public ArrayList<song> getSongList() {
        ArrayList<song> songList =new ArrayList<song>();
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `java_songpath` ";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            song song;
            while(rs.next()) {
                song = new song(rs.getString("songName"), rs.getString("songArtist"), rs.getString("songGenre"), rs.getString("songpath"));
                songList.add(song);
            }
        } catch (SQLException ex) {
            Logger.getLogger(homeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return songList;
    } 
  
    public void displaySongs() {
        ArrayList<song> list = getSongList();
        DefaultTableModel model = (DefaultTableModel)songsFromDb.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getSongName();
            row[1] = list.get(i).getSongArtist();
            row[2] = list.get(i).getSongGenre();
            row[3] = list.get(i).getSongPath();
            model.addRow(row);
        }
    }
    
    public void displaySongsFromPlaylist() {
        ArrayList<song> list = getSongList();
        DefaultTableModel model = (DefaultTableModel)playlistDisplay.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getSongName();
            row[1] = list.get(i).getSongArtist();
            row[2] = list.get(i).getSongGenre();
            row[3] = list.get(i).getSongPath();
            model.addRow(row);
        }
    }
    
    public void executeSql(String query, String message) {
        Connection con = MyConnection.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if((st.executeUpdate(query)) == 1) {
                
                DefaultTableModel model = (DefaultTableModel)songsFromDb.getModel();
                model.setRowCount(0);
                displaySongs();
                JOptionPane.showMessageDialog(null, "Data " + message + " Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Data " + message + " Failed");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void genreCmbx() {
        String query = "SELECT DISTINCT songGenre FROM `java_songpath`";
        Connection con;
        Statement st;
        ResultSet rs;
        genresComboBox.removeAllItems();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/jukebox?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","mad12345");
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                genresComboBox.addItem(rs.getString(1));
            }
            st.close();
            rs.close();
            con.close();
        }  
        catch (SQLException ex) {
                Logger.getLogger(homeScreen.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void bindComboBoxes1(String genreType) {
        String query = "SELECT songArtist FROM `java_songpath` WHERE songGenre = '" + genreType + "'";
        Connection con;
        Statement st;
        ResultSet rs;
        artistsComboBox.removeAllItems();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/jukebox?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","mad12345");
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                artistsComboBox.addItem(rs.getString(1));
            }
            st.close();
            rs.close();
            con.close();
        }  
        catch (SQLException ex) {
                Logger.getLogger(homeScreen.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void bindComboBoxes2(String artistName) {
        String query = "SELECT songName FROM `java_songpath` WHERE songArtist = '" + artistName + "'";
        Connection con;
        Statement st;
        ResultSet rs;
        songsComboBox.removeAllItems();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/jukebox?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","mad12345");
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()) {
                songsComboBox.addItem(rs.getString(1));
            }
            st.close();
            rs.close();
            con.close();
        }  
        catch (SQLException ex) {
                Logger.getLogger(homeScreen.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuSide;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton addSong_Btn;
    private javax.swing.JButton addSong_Btn1;
    private javax.swing.JComboBox<String> artistsComboBox;
    private javax.swing.JPanel bigPane2;
    private javax.swing.JPanel bigPane3;
    private javax.swing.JPanel bigPane4;
    private javax.swing.JPanel bigPanel;
    private javax.swing.JLabel decreaseVolume_Btn;
    private javax.swing.JButton exit_Btn;
    private javax.swing.JComboBox<String> genresComboBox;
    private javax.swing.JButton genres_Btn;
    public javax.swing.JLabel greetingLabel1;
    private javax.swing.JLabel homePageLabel;
    private javax.swing.JLabel increaseVolume_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loopStat;
    private javax.swing.JLabel muteStat;
    private javax.swing.JLabel mute_Btn;
    private javax.swing.JPanel nowPlayinDisplay;
    private javax.swing.JButton options_Btn;
    private javax.swing.JLabel page1;
    private javax.swing.JLabel page3;
    private javax.swing.JLabel pause_Btn;
    private javax.swing.JButton playList_Btn;
    private javax.swing.JLabel play_Btn;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JTable playlistDisplay;
    private javax.swing.JPanel pnlCard0;
    private javax.swing.JPanel pnlCard1;
    private javax.swing.JPanel pnlCard2;
    private javax.swing.JPanel pnlCard3;
    private javax.swing.JPanel pnlCard4;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JButton removeSong_Btn;
    private javax.swing.JButton removeSong_Btn1;
    private javax.swing.JLabel repeat_Btn;
    private javax.swing.JPanel rightSide;
    private javax.swing.JLabel selectSongButton;
    private javax.swing.JLabel signature;
    private javax.swing.JTextField songArtistField;
    private javax.swing.JTextField songArtistField1;
    private javax.swing.JLabel songArtistLabel;
    private javax.swing.JLabel songArtistLabel1;
    public static javax.swing.JLabel songDisplay;
    private javax.swing.JTextField songGenreField;
    private javax.swing.JLabel songGenreLabel;
    private javax.swing.JTable songListTable;
    private javax.swing.JTextField songNameField;
    private javax.swing.JTextField songNameField1;
    private javax.swing.JLabel songNameLabel;
    private javax.swing.JLabel songNameLabel1;
    private javax.swing.JTextField songPathField;
    private javax.swing.JLabel songPathLabel;
    private javax.swing.JComboBox<String> songsComboBox;
    private javax.swing.JTable songsFromDb;
    private javax.swing.JButton songs_Btn;
    private javax.swing.JLabel stop_Btn;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables

    private Object getComponentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
