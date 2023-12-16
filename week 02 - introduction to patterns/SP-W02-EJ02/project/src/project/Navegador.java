package project;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Navegador {

	protected Shell shell;
	private Text txtURL;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Navegador window = new Navegador();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(542, 515);
		shell.setText("SWT Application");
		
		Browser browser = new Browser(shell, SWT.NONE);
		browser.setBounds(0, 83, 526, 383);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(20, 13, 31, 15);
		lblNewLabel.setText("URL");
		
		txtURL = new Text(shell, SWT.BORDER);
		txtURL.setBounds(62, 10, 362, 25);
		
		Button btnSiguiente = new Button(shell, SWT.NONE);
		btnSiguiente.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.forward();
			}
		});
		btnSiguiente.setBounds(20, 52, 75, 25);
		btnSiguiente.setText("Siguiente");
		
		Button btnAtras = new Button(shell, SWT.NONE);
		btnAtras.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.back();
			}
		});
		btnAtras.setBounds(108, 52, 75, 25);
		btnAtras.setText("Atras");
		
		Button btnIr = new Button(shell, SWT.NONE);
		btnIr.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.setUrl(txtURL.getText());
			}
		});
		btnIr.setBounds(189, 52, 75, 25);
		btnIr.setText("Ir");
		
		Button btnRefrescar = new Button(shell, SWT.NONE);
		btnRefrescar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				browser.refresh();
			}
		});
		btnRefrescar.setBounds(270, 52, 75, 25);
		btnRefrescar.setText("Refrescar");

	}
}
