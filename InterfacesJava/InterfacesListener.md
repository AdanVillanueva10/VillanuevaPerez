# Listener Interfaces

### Las interfaces escucha son instancias de las clases definidas por el usuario que implementan los métodos definidos por la interfaz.
### Los listener se encargan de controlar los eventos, esperan que el evento se lleve acabo y realiza una serie de acciones, segun el evento, necesitaremos un Listener que lo controle.
### Cada Listener tiene una serie de métodos que debemos implementar obligatoriamente, aunque solo queramos usar uno solo de ellos.
# Los Listener que usaremos estarán en el paquete:
> #  java.awt.event

# 1. ActionListener 
### *Se produce al hacer click en un componente, también si se pulsa Enter teniendo el foco en el componente.*
> ## Método 
> ## public void actionPerformed(ActionEvent e) 
## Eventos:  
- ## JButton: click o pulsar Enter con el foco activado en él.
- ## **JList**: doble click en un elemento de la lista.
- ## **JMenuItem**: Selecciona una opción del menú.
- ## **JTextField**: al pulsar Enter con el foco activado
# 2. KeyListener 
### *Se produce al pulsar una tecla, según el método cambiará la forma de pulsar la tecla.*
> ## Método
> ## public void keyTyped(KeyEvent e)
> ## public void KeyPressed(KeyEvent e)
> ## public void KeyReleased(KeyEvent e)
## Eventos:
- ## **KeyTyped**: al pulsar y soltar la tecla.
- ## **KeyPressed**: al pulsar la tecla.
- ## **KeyReleased**: al soltar la tecla.
# 3. FocusListener
### *Se produce cuando un componente gana o pierde el foco, es decir, que esta seleccionado.*
> ## public void focusGained(FocusEvent e)
> ## public void focusLost(FocusEvent e)
## Eventos:
  ## **Recibir o perder el foco.**
# 4. MouseListener 
### *Se produce cuando realizamos una acción con el ratón.*
> ## Método
> ## public void mouseClicked(MouseEvent e)
> ## public void mouseEntered(MouseEvent e)
> ## public void mouseExited(MouseEvent e)
> ## public void mousePressed(MouseEvent e)
> ## public void mouseReleased(MouseEvent e)
## Eventos: 
- ## **mouseClicked**: Pinchar y soltar.
- ## **mouseEntered**: Entrar en un componente con el puntero.
- ## **mouseExited**: Salir de un componente con el puntero.
- ## **mousedPressed**: Presionar el botón.
- ## **mousedReleased**: Soltar el botón.
# 5. MouseMotionListener
### *Se produce cuando mueves el mouse.*
> ## Método
> ## public void mouseDragged(MouseEvent e)
> ## public void mouseMoved(MouseEvent e)
## Eventos: 
- ## **mouseDragged**: click y arrastrar un componente.
- ## **mouseMoved**: al mover el puntero sobre un elemento.
# 6. ComponentListener
### *Esta interfaz se utiliza para recibir los eventos de los componentes.*
> ## Método
> ## public void componentHidden(ComponentEvent e)
> ## public void anularcomponentMoved(ComponentEvent e)
> ## public void componentResized(ComponentEvent e)
> ## public void ComponentShow(ComponentEvent e)
## Eventos:
- ## **componentHidden**: Se invoca cuando el coomponente se ha vuelto invisible.
- ## **anularcomponentMoved**: Se invoca cuando cambia la posición del componente.
- ## **componentResized**: Se invoca cuando cambia el tamaño del componente.
- ## **ComponentShow**: Se invoca cuando el componente se ha hecho visible.
# 7. ItemListener
### *Esta interfaz se utiliza para recibir los eventos del artículo.*
> ## Método
> ## public void itemStateChanged(itemEvent e)
## Eventos: 
- ## **itemStateChanged**: Se invoca cuando el usuario ha seleccionado o anulado la selección de un elemento.
# 8. ContainerListener
### *Esta interfaz se utiliza para recibir los eventos del contenedor.*
> ## Método
> ## public void componentAdded(ContainerEvent e)
> ## public void componentRemoved(ContainerEvent e)
## Eventos:
- ## **ComponentAdded**: Se invoca cuando se ha agregado un componente al contenedor.
- ## **ComponentRemoved**: Se invoca cuando se ha eliminado un componente al contenedor.

