public class Imagen1 extends View {
        Drawable imagen = getResources().getDrawable(R.drawable.mapa);

        public Imagen1(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLACK);
            Paint p= new Paint();
            p.setAntiAlias(true);
            //Dimensiones del canvas
            int  altoCa = getBottom();
            int anchoCa = getRight();
         //   float medioCa = (float)altoCa/anchoCa;
            //Dimensiones imagen
            int  alto = imagen.getIntrinsicHeight();
            int ancho = imagen.getIntrinsicWidth();
          //  float medio = (float)alto/ancho;
/*
            //Algortimo
            int an, al;
            if(medioCa<medio){
                an= anchoCa;
                al= (int)(medio*ancho);
            }else{
                al=altoCa;
                an = (int) (al/medio);

            }*/

            //Poner imagen
            imagen.setBounds(0, 0, 509, 511);
            imagen.draw(canvas);

         //   super.onDraw(canvas);
        }
    }