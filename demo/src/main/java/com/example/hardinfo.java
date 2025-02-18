package com.example;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.CentralProcessor.ProcessorIdentifier;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;
import oshi.software.os.OperatingSystem;

public class hardinfo {



    public static void main(String[] args) {
        // Inicializar la clase SystemInfo para acceder a la información del sistema
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hal = systemInfo.getHardware();

        // Información del procesador
        CentralProcessor processor = hal.getProcessor();
        ProcessorIdentifier processorId = processor.getProcessorIdentifier();
        System.out.println("Nombre del procesador: " + processorId.getName());
        System.out.println("Familia: " + processorId.getFamily());
        System.out.println("Modelo: " + processorId.getModel());
        System.out.println("Frecuencia máxima: " + processorId.getMaxFreq() / 1000 + " MHz");
        System.out.println("Frecuencia mínima: " + processorId.getMinFreq() / 1000 + " MHz");
        System.out.println("Número de núcleos físicos: " + processor.getPhysicalProcessorCount());
        System.out.println("Número de núcleos lógicos: " + processor.getLogicalProcessorCount());

        // Información de la memoria
        GlobalMemory memory = hal.getMemory();
        System.out.println("Memoria total: " + memory.getTotal() / (1024 * 1024) + " MB");
        System.out.println("Memoria disponible: " + memory.getAvailable() / (1024 * 1024) + " MB");

        // Información del sistema operativo
        OperatingSystem os = systemInfo.getOperatingSystem();
        System.out.println("Sistema Operativo: " + os);
        System.out.println("Arquitectura del sistema: " + os.getArchitecture());
        System.out.println("Nombre del sistema operativo: " + os.getFamily());
        System.out.println("Versión del sistema operativo: " + os.getVersionInfo());

        // Información sobre discos y particiones
        System.out.println("\nParticiones de disco:");
        for (HWDiskStore disk : hal.getDiskStores()) {
            System.out.println("Disco: " + disk.getModel());
            System.out.println("Tamaño: " + disk.getSize() / (1024 * 1024 * 1024) + " GB");
        }

        // Información de la CPU (hilos por núcleo)
        System.out.println("\nHilos por núcleo: " + processor.getLogicalProcessorCount() / processor.getPhysicalProcessorCount());
    }
}