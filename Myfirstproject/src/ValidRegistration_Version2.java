public static int ValidRegistration(int parentAge, int parentLevel, int childAge, int childLevel) {
    boolean parentValid = (parentAge >= 18 && parentAge <= 65) && (parentLevel >= 1 && parentLevel <= 5);
    boolean childValid = (childAge >= 3 && childAge <= 12) && (childLevel >= 1 && childLevel <= 5);

    if (parentValid && childValid) {
        return 1;
    } else if (parentValid) {
        return 2;
    } else if (childValid) {
        return 3;
    } else {
        return 4;
    }
}