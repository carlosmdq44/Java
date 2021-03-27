#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#define DIM 30
#define Ar_personas "Personas.bin"
#define Ar_deudas "deudas.bin"

typedef struct
{
    int dni; // 12345878
    char apeynom[40]; //apellido y nombre, ej:Perez Juan
    int antiguedad; // en años, ej: 20
} regPersona;

typedef struct
{
    int dni; // 12345678
    float totalDeuda; // ej: 2500.20
} regDeuda;

typedef struct
{
    regPersona dato;
    regDeuda dat;
} StRegistro;

int decimeSiExiste(char ARCHIVO,int dni);
void mostrarUnaPersona(StRegistro c);
void mostrarArrayPersonas(StRegistro A[],int v);
int pasajeArchivoArrayDeudas(char ARCHIVO,regDeuda A[]);
int pasajeArchivoArrayPersonas1(char ARCHIVO,regPersona A[]);

int main()
{
    StRegistro listado[DIM];
    int validos=0;
    regDeuda listadoDeuda[DIM];
    regPersona listadoPersona[DIM];
    int vPersona= 0;
    int vDeuda=0;
    validos = pasajeArchivoArrayPersonas1(Ar_personas,listadoPersona);
    validos = pasajeArchivoArrayDeudas(Ar_deudas,listadoDeuda);


    return 0;
}

int funcionUnida(StRegistro A[],int v)
{
    regDeuda d;
    regPersona p;
}

void mostrarUnaPersona(StRegistro c)  //no se pide
{
    printf("\nDni..................................: %d",c.dato.dni);
    printf("\nNombre y Apellido....................: %s",c.dato.apeynom);
    printf("\nAntiguedad.........................-.: %d",c.dato.antiguedad);
    printf("\nTotal Deuda..........................: %.2f",c.dat.totalDeuda);
}

void mostrarArrayPersonas(StRegistro A[],int v)//no se pide
{
    for(int i=0; i<v; i++)
    {
        mostrarUnaPersona(A[i]);
        printf("\n");
    }
}

int pasajeArchivoArrayPersonas1(char ARCHIVO, regPersona A[])
{
    int v=0;
    regPersona c;
    FILE *pArch = fopen(ARCHIVO,"rb");
    if(pArch)
    {
        while(fread(&c,sizeof(regPersona),1,pArch)>0)
        {
            A[v] = c;
            v++;
        }
        fclose(pArch);
    }

    return v;
}

int pasajeArchivoArrayDeudas(char ARCHIVO,regDeuda A[])
{
    int v=0;
    regDeuda c;
    FILE *pArch = fopen(ARCHIVO,"rb");
    if(pArch)
    {
        while(fread(&c,sizeof(regDeuda),1,pArch)>0)
        {
            A[v] = c;
            v++;
        }
        fclose(pArch);
    }

    return v;
}
