package org.example;

import java.util.*;


public class Gms {

    public static void gms(String[] args) {
        List<Integer> init_byte_code = getInitByteCode(2, 70);
        List<Integer> fingerprintCode = Arrays.asList(106, 0, 0, 2, 0, 6, 237, 97, 60, 202, 205, 97, 141, 138, 67, 126, 111, 160, 157, 133, 61, 244, 0, 52, 1, 16, 10, 217, 212, 201, 95, 122, 82, 209, 188, 141, 162, 233, 125, 104, 26, 100, 84, 236, 151, 139, 183, 69, 239, 220, 131, 170, 199, 207, 81, 119, 249, 172, 4, 205, 246, 94, 252, 150, 173, 195, 126, 55, 197, 137, 186, 46, 108, 155, 106, 233, 205, 0, 0, 2, 121, 157, 0, 0, 0, 18, 167, 1, 7, 177, 0, 77, 65, 84, 238, 127, 174, 139, 29, 223, 144, 253, 4, 221, 42, 97, 65, 42, 2, 227, 209, 58, 20, 237, 181, 221, 179, 174, 87, 31, 219, 201, 76, 171, 8, 86, 129, 41, 53, 230, 81, 203, 197, 79, 94, 166, 63, 97, 24, 120, 56, 254, 18, 35, 205, 184, 179, 49, 101, 162, 144, 99, 92, 240, 237, 46, 11, 40, 240, 89, 176, 5, 39, 175, 134, 47, 25, 14, 93, 86, 13, 182, 194, 199, 62, 139, 88, 50, 219, 84, 196, 30, 179, 128, 132, 217, 66, 74, 164, 123, 60, 142, 188, 109, 60, 0, 64, 34, 95, 126, 11, 39, 117, 136, 140, 159, 126, 169, 195, 228, 198, 185, 99, 252, 124, 176, 199, 7, 226, 168, 164, 121, 124, 77, 56, 33, 116, 59, 31, 253, 41, 69, 190, 87, 220, 93, 251, 84, 175, 35, 141, 96, 154, 71, 45, 244, 99, 33, 225, 228, 115, 32, 92, 115, 43, 202, 96, 196, 248, 157, 77, 191, 207, 15, 161, 75, 102, 174, 63, 85, 90, 85, 21, 184, 229, 24, 10, 45, 210, 193, 236, 52, 188, 173, 213, 221, 44, 15, 78, 12, 31, 95, 51, 218, 42, 248, 58, 99, 36, 124, 125, 17, 253, 148, 176, 144, 255, 64, 0, 237, 24, 39, 3, 54, 183, 181, 153, 113, 63, 210, 161, 116, 136, 238, 170, 44, 11, 179, 142, 96, 10, 60, 245, 122, 163, 206, 159, 86, 52, 97, 208, 109, 45, 91, 18, 119, 48, 230, 140, 233, 124, 53, 163, 137, 8, 195, 237, 122, 118, 138, 49, 7, 20, 36, 157, 238, 119, 81, 69, 149, 58, 116, 165, 179, 198, 227, 41, 102, 148, 17, 229, 119, 153, 160, 178, 13, 250, 78, 190, 52, 16, 116, 106, 123, 122, 4, 237, 8, 100, 10, 202, 118, 101, 128, 47, 154, 55, 185, 166, 63, 150, 165, 12, 70, 24, 163, 223, 111, 101, 111, 235, 96, 2, 64, 75, 5, 67, 145, 114, 28, 177, 20, 123, 151, 162, 196, 99, 81, 83, 48, 15, 91, 14, 48, 23, 129, 235, 147, 206, 166, 120, 222, 124, 64, 192, 55, 230, 76, 159, 78, 45, 250, 149, 195, 191, 137, 10, 176, 67, 108, 27, 100, 24, 166, 159, 250, 168, 220, 14, 3, 243, 234, 118, 107, 48, 35, 109, 227, 111, 166, 86, 179, 181, 83, 74, 198, 249, 113, 72, 250, 94, 244, 104, 26, 30, 183, 31, 144, 183, 154, 76, 51, 90, 184, 166, 20, 95, 162, 236, 146, 242, 27, 58, 199, 52, 104, 82, 197, 38, 13, 102, 192, 113, 196, 178, 185, 188, 15, 121, 55, 116, 196, 221, 68, 249, 47, 81, 178, 112, 74, 198, 40, 19, 47, 204, 17, 4, 102, 19, 117, 49, 200, 110, 226, 190, 7, 192, 251, 196, 3, 186, 70, 174, 227, 221, 30, 73, 215, 243, 62, 236, 118, 139, 108, 24, 197, 170, 176, 25, 163, 137, 120, 116, 8, 65, 224, 231, 40, 207, 35, 126, 208, 74, 61, 41, 153, 102, 12, 231, 2, 194, 232, 88, 216, 219, 248, 105, 99, 56, 246, 67, 110, 11, 236, 66, 169, 106, 32, 196, 55, 118, 14, 246, 139, 99, 227, 176, 254, 213, 180, 135, 0, 135, 185, 112, 148, 73, 24, 248, 217, 32, 165, 62, 195, 90, 208, 195, 73, 212, 102, 56, 239, 48, 104, 235, 28, 163, 215, 9, 249, 120, 8, 28, 91, 198, 168, 82, 172, 184, 250, 232, 31, 187, 239, 221, 120, 180, 174, 99, 28, 48, 215, 178, 94, 252, 40, 176, 126, 128, 225, 47, 145, 156, 207, 182, 168, 38, 4, 71, 109, 104, 62, 243, 168, 31, 155, 73, 14, 111, 193, 132, 170, 29, 242, 100, 37, 193, 63, 26, 198, 160, 21, 144, 183, 127, 59, 119, 46, 144, 85, 27, 104, 135, 74, 71, 53, 10, 132, 119, 88, 80, 22, 121, 108, 192, 208, 105, 168, 232, 183, 86, 71, 217, 89, 204, 81, 156, 9, 41, 160, 161, 27, 119, 90, 251, 24, 104, 242, 239, 62, 76, 77, 245, 100, 136, 55, 181, 238, 70, 179, 159, 0, 161, 214, 77, 197, 195, 223, 29, 113, 202, 105, 71, 4, 200, 245, 211, 90, 80, 141, 141, 188, 70, 117, 143, 212, 201, 158, 132, 190, 155, 171, 74, 251, 158, 207, 155, 139, 229, 25, 199, 172, 80, 225, 243, 208, 86, 181, 58, 191, 170, 76, 172, 203, 138, 194, 12, 66, 156, 82, 170, 157, 36, 63, 223, 107, 248, 100, 129, 160, 67, 207, 9, 221, 167, 4, 125, 194, 62, 53, 35, 68, 134, 235, 24, 235, 232, 3, 115, 128, 71, 90, 94, 39, 0, 136, 209, 132, 243, 66, 31, 147, 17, 190, 28, 36, 72, 213, 13, 111, 79, 203, 201, 29, 98, 133, 222, 220, 249, 56, 54, 151, 129, 136, 71, 158, 198, 167, 37, 176, 63, 222, 51, 16, 149, 175, 131, 210, 145, 162, 215, 143, 219, 193, 25, 48, 251, 121, 179, 175, 33, 113, 137, 8, 174, 179, 123, 235, 114, 99, 144, 11, 146, 223, 113, 7, 183, 142, 88, 13, 183, 242, 84, 21, 113, 167, 73, 63, 138, 246, 115, 62, 64, 252, 216, 203, 35, 252, 177, 32, 40, 84, 235, 211, 255, 228, 35, 99, 255, 252, 164, 113, 197, 252, 185, 63, 17, 103, 113, 249, 49, 116, 101, 227, 7, 86, 57, 234, 74, 50, 205, 240, 55, 37, 54, 17, 208, 84, 173, 29, 144, 35, 6, 46, 103, 133, 179, 240, 178, 21, 15, 214, 103, 16, 109, 236, 61, 105, 134, 41, 187, 143, 31, 116, 29, 18, 38, 223, 57, 129, 148, 115, 162, 6, 204, 59, 117, 171, 2, 206, 8, 196, 60, 46, 118, 168, 75, 235, 208, 6, 96, 235, 87, 20, 104, 177, 147, 153, 43, 147, 162, 202, 94, 190, 189, 151, 196, 24, 39, 198, 199, 198, 112, 214, 117, 105, 218, 248, 113, 177, 65, 142, 138, 55, 103, 1, 44, 95, 197, 92, 16, 66, 164, 212, 22, 175, 118, 27, 49, 222, 26, 230, 36, 173, 168, 178, 35, 245, 165, 133, 25, 199, 114, 23, 126, 217, 13, 58, 138, 13, 151, 229, 171, 121, 151, 90, 37, 88, 33, 254, 73, 250, 209, 117, 207, 161, 71, 236, 97, 26, 180, 28, 141, 15, 97, 141, 171, 211, 176, 222, 236, 255, 110, 210, 83, 153, 210, 163, 120, 186, 192, 117, 168, 128, 51, 105, 132, 34, 185, 248, 12, 48, 13, 229, 174, 104, 179, 116, 247, 44, 107, 71, 93, 87, 83, 45, 188, 252, 171, 202, 113, 33, 32, 12, 6, 44, 50, 92, 155, 142, 196, 245, 149, 84, 155, 118, 142, 95, 172, 246, 154, 34, 9, 213, 243, 93, 51, 41, 92, 17, 249, 191, 95, 169, 90, 161, 140, 245, 110, 247, 49, 116, 66, 122, 89, 51, 13, 18, 145, 110, 47, 52, 75, 99, 217, 222, 70, 28, 123, 238, 53, 67, 113, 217, 109, 242, 167, 134, 161, 109, 9, 37, 109, 132, 117, 60, 77, 108, 188, 156, 42, 104, 118, 153, 33, 5, 68, 97, 151, 55, 52, 167, 136, 197, 115, 208, 91, 10, 155, 108, 57, 60, 168, 107, 162, 36, 210, 170, 232, 30, 147, 73, 157, 248, 77, 197, 196, 147, 68, 92, 155, 15, 175, 75, 59, 5, 185, 41, 29, 140, 79, 123, 113, 236, 18, 215, 52, 245, 6, 252, 225, 238, 77, 244, 56, 193, 32, 79, 9, 73, 166, 132, 89, 97, 111, 182, 3, 106, 163, 92, 46, 19, 29, 164, 124, 225, 204, 222, 83, 158, 63, 117, 182, 86, 177, 13, 127, 237, 148, 227, 228, 123, 66, 67, 30, 88, 235, 83, 12, 98, 253, 124, 47, 229, 249, 95, 22, 15, 104, 61, 54, 99, 115, 127, 103, 139, 205, 134, 220, 127, 216, 248, 127, 31, 7, 13, 196, 38, 51, 156, 254, 32, 58, 129, 137, 184, 219, 121, 21, 96, 198, 127, 215, 17, 84, 62, 98, 103, 233, 155, 221, 191, 78, 142, 130, 143, 117, 1, 18, 146, 243, 31, 248, 81, 73, 28, 160, 44, 233, 127, 124, 198, 134, 218, 126, 17, 173, 157, 99, 216, 19, 173, 212, 113, 108, 185, 124, 127, 78, 163, 40, 96, 230, 193, 59, 130, 216, 97, 22, 132, 125, 134, 60, 153, 123, 136, 113, 178, 90, 213, 223, 223, 6, 110, 137, 224, 175, 22, 124, 222, 170, 65, 202, 47, 51, 107, 241, 87, 238, 162, 146, 18, 31, 73, 2, 65, 113, 136, 238, 102, 206, 211, 198, 78, 169, 104, 64, 198, 58, 72, 163, 234, 188, 152, 255, 43, 114, 223, 233, 120, 28, 186, 1, 28, 192, 237, 222, 85, 240, 75, 192, 208, 88, 161, 47, 20, 186, 169, 129, 186, 234, 21, 3, 56, 126, 98, 145, 76, 152, 105, 113, 122, 72, 227, 199, 218, 248, 146, 117, 101, 255, 144, 204, 146, 16, 211, 75, 232, 175, 199, 43, 79, 144, 139, 69, 199, 14, 216, 185, 122, 103, 255, 175, 36, 55, 105, 53, 99, 134, 5, 145, 17, 5, 226, 148, 65, 63, 10, 58, 205, 171, 29, 119, 201, 84, 216, 30, 39, 130, 150, 177, 189, 188, 167, 44, 29, 65, 133, 22, 95, 38, 64, 31, 2, 180, 176, 224, 193, 233, 105, 99, 62, 150, 130, 41, 104, 98, 123, 81, 182, 33, 84, 86, 13, 133, 103, 17, 74, 122, 193, 202, 214, 165, 117, 136, 69, 108, 38, 128, 174, 72, 62, 127, 136, 211, 181, 157, 228, 145, 37, 6, 160, 205, 33, 145, 94, 0, 150, 178, 65, 181, 15, 199, 158, 92, 32, 32, 142, 170, 220, 198, 57, 146, 133, 104, 26, 68, 151, 48, 135, 240, 9, 205, 56, 51, 210, 22, 75, 47, 240, 206, 142, 27, 216, 183, 250, 135, 199, 164, 230, 195, 19, 41, 75, 79, 49, 213, 132, 158, 69, 252, 237, 31, 223, 43, 18, 208, 6, 145, 35, 186, 49, 45, 242, 188, 4, 96, 76, 220, 62, 236, 65, 85, 90, 124, 17, 93, 94, 238, 83, 166, 78, 51, 30, 229, 77, 185, 82, 37, 191, 140, 65, 170, 35, 107, 226, 58, 116, 234, 156, 178, 197, 191, 111, 55, 13, 247, 226, 21, 114, 220, 20, 122, 67, 21, 235, 69, 254, 19, 52, 135, 143, 107, 129, 236, 185, 116, 251, 73, 118, 140, 48, 241, 84, 184, 249, 246, 124, 76, 171, 28, 232, 186, 107, 172, 67, 111, 226, 110, 23, 32, 3, 98, 70, 197, 246, 213, 176, 238, 70, 132, 209, 58, 210, 93, 35, 220, 250, 245, 87, 110, 135, 103, 188, 118, 159, 30, 21, 40, 182, 195, 244, 21, 108, 45, 27, 12, 244, 30, 32, 100, 141, 30, 118, 37, 183, 134, 17, 87, 68, 112, 217, 201, 42, 77, 95, 203, 54, 73, 101, 105, 97, 129, 135, 40, 251, 179, 139, 18, 93, 232, 200, 128, 99, 123, 156, 70, 91, 127, 26, 79, 232, 136, 255, 174, 166, 115, 65, 33, 29, 214, 110, 121, 52, 55, 110, 116, 226, 219, 237, 75, 92, 105, 118, 118, 157, 69, 240, 49, 34, 28, 106, 140, 36, 170, 107, 9, 19, 8, 246, 136, 0, 196, 32, 182, 0, 82, 85, 254, 1, 212, 217, 198, 22, 75, 107, 9, 183, 7, 41, 56, 113, 51, 47, 71, 37, 79, 208, 158, 132, 139, 126, 67, 240, 99, 47, 147, 17, 177, 188, 125, 1, 240, 188, 166, 166, 122, 94, 143, 133, 35, 69, 3, 139, 202, 251, 243, 42, 159, 135, 135, 220, 210, 95, 228, 116, 112, 160, 171, 21, 242, 61, 116, 32, 108, 100, 79, 165, 58, 126, 129, 137, 82, 154, 123, 84, 67, 121, 209, 188, 104, 230, 163, 15, 34, 112, 122, 78, 29, 97, 8, 83, 52, 105, 43, 243, 74, 175, 79, 87, 152, 157, 70, 168, 133, 199, 226, 131, 65, 52, 227, 167, 54, 150, 20, 10, 207, 173, 58, 115, 158, 56, 137, 19, 55, 107, 69, 246, 157, 229, 180, 207, 254, 97, 25, 44, 5, 232, 101, 51, 23, 211, 184, 245, 159, 221, 218, 200, 69, 60, 199, 181, 174, 36, 59, 93, 1, 196, 129, 250, 40, 138, 64, 102, 46, 118, 110, 199, 12, 196, 47, 66, 74, 97, 75, 144, 118, 89, 224, 142, 47, 225, 148, 38, 5, 210, 149, 238, 178, 138, 80, 123, 189, 244, 63, 190, 18, 39, 232, 119, 166, 220, 173, 71, 237, 78, 103, 12, 68, 109, 37, 60, 173, 103, 88, 85, 109, 208, 37, 133, 159, 137, 243, 172, 116, 112, 201, 149, 81, 30, 134, 188, 120, 205, 191, 133, 36, 125, 25, 43, 43, 248, 1, 90, 47, 22, 38, 46, 48, 152, 201, 173, 54, 120, 147, 240, 217, 22, 216, 143, 6, 88, 148, 217, 102, 196, 130, 126, 107, 20, 119, 199, 103, 204, 180, 166, 215, 238, 85, 175, 110, 75, 141, 45, 204, 240, 106, 196, 65, 123, 110, 234, 95, 246, 101, 124, 101, 129, 100, 77, 12, 215, 179, 156, 59, 185, 241, 183, 23, 89, 3, 150, 83, 196, 243, 209, 91, 226, 197, 70, 136, 251, 140, 146, 96, 63, 101, 192, 0, 219, 241, 198, 81, 18, 189, 69, 68, 28, 152, 176, 106, 117, 169, 209, 243, 202, 93, 143, 91, 108, 169, 135, 135, 240, 228, 227, 58, 145, 124, 134, 127, 10, 94, 60, 121, 126, 34, 174, 202, 61, 1, 18, 203, 241, 235, 79, 125, 110, 65, 56, 106, 3, 30, 203, 78, 198, 95, 210, 69, 208, 0, 145, 87, 75, 46, 252, 213, 116, 251, 22, 192, 163, 72, 66, 255, 34, 27, 76, 221, 101, 228, 117, 82, 163, 65, 95, 93, 43, 170, 106, 11, 207, 158, 119, 198, 135, 15, 220, 217, 165, 95, 96, 147, 38, 42, 226, 50, 174, 118, 226, 62, 139, 153, 39, 216, 251, 13, 63, 65, 158, 192, 41, 8, 72, 178, 9, 12, 127, 67, 20, 242, 75, 79, 135, 52, 87, 63, 5, 24, 46, 136, 145, 33, 48, 197, 242, 71, 251, 198, 58, 58, 178, 106, 138, 99, 59, 73, 157, 10, 27, 195, 167, 157, 82, 111, 182, 157, 219, 251, 254, 152, 121, 135, 40, 230, 250, 69, 116, 167, 84, 228, 185, 73, 108, 30, 238, 152, 181, 52, 244, 124, 160, 249, 86, 207, 101, 141, 88, 155, 36, 239, 23, 110, 242, 250, 151, 116, 90, 113, 252, 28, 110, 121, 66, 72, 5, 169, 63, 10, 252, 56, 111, 231, 166, 41, 45, 136, 239, 182, 68, 132, 172, 92, 56, 161, 242, 203, 202, 28, 144, 212, 132, 214, 147, 14, 141, 85, 122, 57, 243, 213, 93, 12, 104, 26, 55, 120, 197, 46, 129, 189, 20, 252, 201, 174, 82, 95, 204, 166, 31, 194, 205, 31, 3, 190, 235, 168, 234, 148, 211, 202, 112, 202, 181, 38, 9, 57, 68, 221, 20, 151, 214, 123, 145, 157, 42, 67, 6, 244, 100, 206, 31, 91, 235, 71, 205, 159, 53, 185, 142, 105, 112, 30, 77, 226, 125, 216, 16, 209, 35, 240, 110, 6, 157, 18, 181, 181, 134, 153, 242, 63, 117, 137, 195, 254, 18, 237, 84, 203, 111, 204, 249, 21, 168, 164, 187, 230, 120, 92, 184, 221, 25, 124, 160, 165, 18, 143, 91, 209, 246, 110, 178, 123, 239, 77, 204, 214, 162, 92, 84, 59, 151, 6, 109, 204, 179, 117, 174, 47, 203, 226, 160, 29, 250, 139, 185, 135, 163, 167, 236, 5, 172, 131, 6, 79, 207, 56, 20, 200, 15, 52, 9, 43, 162, 24, 123, 236, 245, 53, 243, 139, 170, 181, 208, 135, 183, 188, 105, 184, 1, 187, 89, 108, 228, 20, 106, 99, 240, 246, 29, 47, 73, 206, 237, 89, 197, 16, 137, 66, 118, 224, 160, 38, 1, 66, 242, 36, 15, 207, 249, 176, 225, 173, 239, 223, 131, 1, 109, 173, 101, 116, 53, 227, 255, 239, 129, 219, 79, 8, 149, 102, 199, 75, 241, 79, 174, 33, 18, 54, 159, 162, 255, 148, 77, 102, 24, 49, 213, 56, 76, 11, 137, 61, 17, 146, 186, 78, 89, 212, 56, 37, 242, 49, 171, 94, 50, 133, 75, 218, 129, 130, 128, 125, 200, 175, 133, 196, 18, 232, 38, 11, 71, 0, 0, 92, 82, 210, 197, 28, 48, 70, 166, 223, 100, 32, 126, 167, 54, 159, 217, 23, 229, 7, 175, 124, 247, 241, 90, 160, 44, 227, 239, 70, 51, 121, 42, 36, 22, 187, 129, 217, 99, 115, 60, 134, 132, 249, 22, 92, 253, 191, 83, 7, 171, 225, 178, 80, 212, 53, 213, 45, 214, 35, 130, 53, 21, 5, 246, 91, 245, 215, 41, 54, 127, 13, 11, 2, 38, 32, 118, 32, 62, 49, 43, 93, 50, 94, 238, 143, 166, 227, 118, 113, 73, 10, 67, 149, 103, 208, 170, 79, 168, 184, 118, 237, 215, 188, 188, 206, 6, 113, 89, 71, 212, 129, 11, 109, 100, 109, 143, 97, 48, 238, 171, 47, 151, 81, 182, 122, 72, 217, 224, 246, 238, 111, 112, 85, 104, 237, 25, 10, 157, 202, 235, 81, 145, 72, 222, 64, 57, 85, 133, 162, 124, 137, 255, 184, 115, 143, 72, 42, 185, 79, 73, 125, 130, 231, 204, 0, 31, 69, 132, 127, 247, 6, 29, 36, 42, 112, 168, 132, 89, 234, 22, 196, 114, 252, 117, 196, 28, 15, 141, 96, 92, 239, 161, 168, 192, 123, 141, 249, 101, 252, 69, 151, 211, 69, 76, 3, 142, 154, 92, 77, 22, 245, 145, 90, 132, 18, 28, 134, 102, 33, 52, 12, 7, 201, 67, 236, 115, 194, 28, 230, 74, 99, 247, 224, 250, 174, 42, 84, 55, 11, 150, 10, 32, 60, 78, 253, 23, 98, 177, 230, 82, 35, 178, 239, 92, 106, 107, 111, 43, 234, 231, 170, 219, 171, 246, 147, 59, 8, 176, 73, 179, 121, 28, 143, 71, 194, 129, 209, 66, 195, 116, 236, 0, 15, 107, 235, 34, 19, 178, 62, 98, 41, 179, 139, 249, 64, 23, 51, 13, 70, 59, 232, 164, 130, 205, 253, 184, 132, 84, 184, 57, 210, 247, 98, 226, 199, 224, 43, 6, 192, 162, 216, 22, 69, 122, 144, 220, 190, 15, 129, 172, 224, 252, 83, 112, 40, 123, 213, 231, 181, 161, 226, 49, 2, 47, 60, 240, 199, 83, 84, 209, 152, 26, 221, 150, 162, 83, 48, 243, 105, 167, 76, 11, 254, 26, 92, 230, 93, 100, 113, 193, 66, 117, 109, 118, 175, 120, 86, 17, 201, 7, 77, 139, 241, 240, 0, 241, 59, 105, 127, 239, 35, 209, 234, 64, 225, 56, 140, 21, 151, 123, 161, 13, 43, 206, 114, 218, 231, 118, 75, 0, 108, 62, 255, 89, 8, 72, 46, 129, 24, 30, 2, 182, 22, 72, 116, 118, 131, 184, 14, 75, 194, 141, 252, 122, 216, 135, 136, 138, 86, 120, 189, 195, 178, 124, 75, 250, 164, 30, 14, 195, 25, 132, 205, 34, 215, 118, 25, 169, 241, 232, 237, 186, 72, 63, 238, 52, 82, 197, 213, 236, 67, 253, 105, 197, 5, 180, 185, 84, 25, 46, 51, 34, 210, 187, 77, 249, 236, 4, 46, 120, 128, 249, 149, 25, 216, 62, 141, 106, 150, 192, 111, 205, 44, 87, 205, 6, 76, 59, 102, 208, 72, 30, 43, 210, 175, 201, 155, 202, 65, 167, 57, 31, 238, 64, 203, 249, 177, 32, 57, 110, 21, 143, 246, 204, 169, 222, 75, 243, 3, 17, 238, 181, 211, 57, 252, 189, 123, 158, 211, 68, 213, 5, 126, 222, 188, 66, 13, 236, 133, 192, 142, 145, 3, 15, 230, 51, 55, 238, 191, 172, 137, 143, 4, 239, 47, 184, 218, 5, 137, 86, 18, 181, 52, 3, 65, 227, 248, 136, 223, 114, 127, 203, 79, 64, 65, 178, 47, 150, 134, 131, 136, 41, 1, 113, 209, 21, 234, 84, 18, 71, 244, 12, 18, 250, 167, 92, 206, 216, 198, 70, 138, 80, 100, 181, 63, 171, 253, 136, 207, 91, 23, 98, 78, 139, 237, 201, 250, 220, 11, 89, 231, 49, 164, 160, 226, 3, 7, 53, 15, 6, 49, 150, 99, 224, 149, 222, 243, 3, 206, 221, 77, 61, 32, 164, 21, 134, 122, 182, 235, 48, 94, 212, 105, 69, 78, 189, 141, 64, 160, 115, 110, 120, 235, 110, 100, 211, 83, 125, 98, 37, 228, 58, 39, 194, 12, 175, 120, 21, 67, 66, 236, 198, 127, 216, 196, 118, 84, 228, 220, 238, 113, 103, 86, 166, 32, 159, 250, 209, 15, 140, 179, 65, 33, 122, 198, 75, 186, 161, 52, 7, 42, 18, 172, 240, 68, 11, 10, 131, 87, 38, 99, 213, 173, 150, 117, 147, 206, 164, 118, 233, 81, 32, 34, 152, 70, 231, 88, 100, 85, 207, 114, 178, 225, 35, 149, 74, 248, 79, 236, 58, 111, 102, 122, 83, 25, 251, 124, 16, 96, 225, 67, 12, 136, 95, 188, 131, 157, 1, 87, 232, 229, 106, 46, 45, 117, 70, 204, 77, 173, 65, 2, 138, 16, 138, 213, 143, 43, 129, 26, 123, 139, 103, 222, 200, 217, 15, 54, 176, 206, 250, 37, 150, 9, 113, 172, 60, 107, 178);
        List<Integer> all_byte_code = new ArrayList<>(init_byte_code);
        all_byte_code.addAll(fingerprintCode);
        List<Integer> middle_array = Arrays.asList(0, 88);
        if (all_byte_code.size() > 1) {
            int firstValue = all_byte_code.get(0);
            int newValue = firstValue ^ 204;
            all_byte_code.set(1, newValue);
        } else {
            System.out.println("error");

        }
        if (all_byte_code.size() > 3 && middle_array.size() > 0) {
            int h = all_byte_code.get(1);
            int L = middle_array.get(0);

            int newValue = 2 * (h | 0) - (h & L) + ~h - (h | ~L);

            all_byte_code.set(3, newValue);
        } else {
            System.out.println("error");
        }

        if (all_byte_code.size() > 4 && middle_array.size() > 1) {
            int w = all_byte_code.get(1);
            int b = middle_array.get(1);

            int newValue = -(w | 0) + 2 * (w | b) - (-1) + ~b;

            all_byte_code.set(4, newValue);
        } else {
            System.out.println("error");
        }

        String req = getRequest(all_byte_code);

        //System.out.println(req);

        String encoded = Base64.getEncoder().encodeToString(req.getBytes());

        String req_arg = encoded.replace("+", "-").replace("/", "_").replace("=", "").replaceAll("\\s+", "").replaceAll("\\s", "");

        //System.out.println("Modified Base64 Encoded String: " + req_arg);

        String modified_req_arg = "<" + req_arg + ">";

        String all_req_arg = "[[[\"eOY7Bb\",\"[[1995,8,7],1,null,null,null,\\\"" + modified_req_arg + "\\\",[null,null,\\\"https://mail.google.com/mail/u/0/\\\",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,\\\"mail\\\"]]\",null,\"generic\"]]]";

        System.out.println(all_req_arg);

    }

    public static List<Integer> getInitByteCode(int H, int r) {
        List<Integer> S = new ArrayList<>();
        r = 70;
        Random random = new Random();

        while (r != 97) {
            if (r == 70) {
                S.clear();
                r = 49;
            } else if (r == 30) {
                r = (H-- > 0) ? 58 : 50;
            } else if (r == 58) {
                int randomByte = random.nextInt(256);
                S.add(randomByte);
                r = 12;
            } else {
                if (r == 50) {
                    return S;
                } else if (r == 12) {
                    r = 30;
                } else if (r == 49) {
                    r = 30;
                }
            }
        }

        return S;
    }

    public static String fromCharCode(List<Integer> codePoints) {
        StringBuilder sb = new StringBuilder();
        for (int codePoint : codePoints) {
            char[] chars = Character.toChars(codePoint);
            sb.append(chars);
        }
        return sb.toString();
    }

    public static String getRequest(List<Integer> intList) {
        StringBuilder B = new StringBuilder();
        int G = 0;
        int length = Math.min(intList.size(), 8192);
        String result = fromCharCode(intList);
//        for (int i = G; i < G + length; i++) {
//            B.append(intList.get(i));
//        }

//        return B.toString();
        return result;
    }


}