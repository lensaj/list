
public class LinkedList{
	private class LinkedObject {

		private int valore;

		private LinkedObject next;

		/**
		 * @return the valore
		 */
		public int getValore() {
			return valore;
		}

		/**
		 * @param valore the valore to set
		 */
		public void setValore(int valore) {
			this.valore = valore;
		}

		/**
		 * @return the next
		 */
		public LinkedObject getNext() {
			return next;
		}

		/**
		 * @param next the next to set
		 */
		public void setNext(LinkedObject next) {
			this.next = next;
		}


	}

	private LinkedObject head;
	
	private LinkedObject tail;
	
	public LinkedObject Add(){
		LinkedObject nuovo = new LinkedObject();
		if( tail == null)
			;
		else{
			head.setNext(nuovo);
			head = nuovo;
		}
			
		return tail;
	}


}
