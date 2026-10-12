public class accessControlEnum {
    public static void main(String[] args) {
        accessControlEnum access = new accessControlEnum();
        access.grantAccess(UserRole.ADMIN, "admin access");
        access.grantAccess(UserRole.EDITOR, "Edit access");
        access.grantAccess(UserRole.EDITOR, "View access");
        System.out.print(UserRole.ADMIN);
    }

    enum UserRole {
        ADMIN,
        EDITOR,
        VIEWER
    }

    void grantAccess(UserRole role, String action) {
        if (role == UserRole.ADMIN) {
            System.out.println("Access approved. Given the full access");
        } else if (role == UserRole.EDITOR) {
            if (action.contains("Edit")) {
                System.out.println("Access approved. Given edit access");
            } else {
                System.out.println("Access denied. You are not elligible");
            }
        } else if (role == UserRole.EDITOR) {
            if (action.contains("View")) {
                System.out.println("Access approved. Given view access");
            } else {
                System.out.println("Access denied. You are not elligible");
            }
        }


    }
}





