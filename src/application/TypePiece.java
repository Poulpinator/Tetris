package application;

import java.util.Random;

public enum TypePiece {
	I {
		@Override
		public Bloc[] genererBlocs() {
			// TODO Auto-generated method stub
			return null;
		}
	}, T {
		@Override
		public Bloc[] genererBlocs() {
			// TODO Auto-generated method stub
			return null;
		}
	}, L {
		@Override
		public Bloc[] genererBlocs() {
			// TODO Auto-generated method stub
			return null;
		}
	}, S {
		@Override
		public Bloc[] genererBlocs() {
			// TODO Auto-generated method stub
			return null;
		}
	}, Z {
		@Override
		public Bloc[] genererBlocs() {
			// TODO Auto-generated method stub
			return null;
		}
	}, J {
		@Override
		public Bloc[] genererBlocs() {
			// TODO Auto-generated method stub
			return null;
		}
	}, O {
		@Override
		public Bloc[] genererBlocs() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	public static TypePiece creer() {
		Random random = new Random();
		int longueur = values().length;
		return values()[longueur];
	}

	public abstract Bloc[] genererBlocs();
}
