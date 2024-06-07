
public class FileHider {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java FileHider [input file] [output file] [password]");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String password = args[2];

        try {
            hideFile(inputFile, outputFile, password);
            System.out.println("File hidden successfully.");
        } catch (Exception e) {
            System.err.println("Error hiding file: " + e.getMessage());
        }
    }

    public static void hideFile(String inputFile, String outputFile, String password) throws Exception {
        // Read input file
        byte[] inputData = new byte[(int) new ile(inputFile).length()];
        FileInputStream in = new FileInputStream(inputFile);
        in.read(inputData);
        in.close();

        // Generate encryption key from password
        byte[] key = password.getBytes();
        for (int i = 0; i < key.length; i++) {
            key[i] = (byte) (key[i] ^ 0x55); // XOR key with a constant value
        }

        // Write output file header
        DataOutputStream out = new DataOutputStream(new FileOutputStream(outputFile));
        out.writeInt(inputData.length);
        out.write(key);

        // XOR input data with key and write to output file
        for (int i = 0; i < inputData.length; i++) {
            inputData[i] = (byte) (inputData[i] ^ key[i % key.length]);
        }
        out.write(inputData);
        out.close();
    }
}