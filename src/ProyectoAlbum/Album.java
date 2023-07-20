package ProyectoAlbum;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Album extends JFrame {
    private JList<Motos> motosList;
    private DefaultListModel<Motos> listModel;

    public Album() {
        super("Lista de Motocicletas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        motosList = new JList<>(listModel);
        motosList.setBackground(new Color(255, 255, 255));

        // Configuración del renderizado personalizado para mostrar imágenes y texto
        motosList.setCellRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Motos motos = (Motos) value;
                JLabel label = (JLabel) super.getListCellRendererComponent(list, motos.getNombre(), index, isSelected, cellHasFocus);
                label.setIcon(motos.getImagen());
                return label;
            }
        });

        // Acción al hacer clic en un automóvil
        motosList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                Motos motos = motosList.getSelectedValue();
                if (motos != null) {
                    motos.mostrarInformacion();
                }
            }
        });

        // Panel de búsqueda
        JPanel searchPanel = new JPanel();
        JLabel searchLabel = new JLabel("Buscar:");
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Filtrar");

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                filtrarMotos(searchField.getText());
            }
        });

        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        // Panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setForeground(new Color(0, 0, 0));
        mainPanel.setBackground(new Color(0, 0, 0));
        mainPanel.add(searchPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(motosList), BorderLayout.CENTER);

        // Configuración de la ventana
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    // Método para filtrar las motocicletas según el nombre o tipo ingresado
    private void filtrarMotos(String keyword) {
        listModel.clear();
        for (Motos moto : getMotos()) {
            if (moto.getNombre().toLowerCase().contains(keyword.toLowerCase())
                    || moto.getTipo().toLowerCase().contains(keyword.toLowerCase())) {
                listModel.addElement(moto);
            }
        }
    }

    // Método para obtener la lista de automóviles (puede ser reemplazado con una fuente de datos real)
    private  List<Motos> getMotos() {
        List<Motos> motos = new ArrayList<>();
        
        //Cargar imagenes
        motos.add(new Chopper("Harley Davidson Softail Deluxe", "ProyectoAlbum/motos/APRILIA%20RS%20660%20EXTREMA%202023.jpg"));
        motos.add(new Chopper("Honda Fury", "Honda_Fury.jpg"));
        motos.add(new Chopper("Honda Rebel 500", "Honda_Rebel_500.jpg"));
        motos.add(new Chopper("Yamaha Bolt R-Spec", "Yamaha_Bolt_R-Spec.jpg"));
        motos.add(new Motoneta("KYMCO Grand Dink 300", "KYMCO_Grand_Dink_300.jpg"));
        motos.add(new Motoneta("Voge SR4 Max", "Voge_SR4_Max.jpg"));
        motos.add(new Motoneta("Zontes M310", "Zontes_M310.jpg"));
        motos.add(new Deportivo("Yamaha YZF-R125", "Yamaha_YZF-R125.jpg"));
        motos.add(new Deportivo("APRILIA RS 660 EXTREME 2023", "APRILIA_RS_660_EXTREME_2023.jpg"));
        motos.add(new Deportivo("CBR 6 F50 Honda3", "CBR_6_F50_Honda.jpg"));
        return motos;
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Album().setVisible(true);
            }
        });
    }
}

	


