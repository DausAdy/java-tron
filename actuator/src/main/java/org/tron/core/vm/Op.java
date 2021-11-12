package org.tron.core.vm;

import java.lang.reflect.Field;

public class Op {

  public static final int STOP = 0x00;
  public static final int ADD = 0x01;
  public static final int MUL = 0x02;
  public static final int SUB = 0x03;
  public static final int DIV = 0x04;
  public static final int SDIV = 0x05;
  public static final int MOD = 0x06;
  public static final int SMOD = 0x07;
  public static final int ADDMOD = 0x08;
  public static final int MULMOD = 0x09;
  public static final int EXP = 0x0a;
  public static final int SIGNEXTEND = 0x0b;
  public static final int LT = 0X10;
  public static final int GT = 0X11;
  public static final int SLT = 0X12;
  public static final int SGT = 0X13;
  public static final int EQ = 0X14;
  public static final int ISZERO = 0x15;
  public static final int AND = 0x16;
  public static final int OR = 0x17;
  public static final int XOR = 0x18;
  public static final int NOT = 0x19;
  public static final int BYTE = 0x1a;
  public static final int SHL = 0x1b;
  public static final int SHR = 0x1c;
  public static final int SAR = 0x1d;
  public static final int SHA3 = 0x20;
  public static final int ADDRESS = 0x30;
  public static final int BALANCE = 0x31;
  public static final int ORIGIN = 0x32;
  public static final int CALLER = 0x33;
  public static final int CALLVALUE = 0x34;
  public static final int CALLDATALOAD = 0x35;
  public static final int CALLDATASIZE = 0x36;
  public static final int CALLDATACOPY = 0x37;
  public static final int CODESIZE = 0x38;
  public static final int CODECOPY = 0x39;
  public static final int RETURNDATASIZE = 0x3d;
  public static final int RETURNDATACOPY = 0x3e;
  public static final int GASPRICE = 0x3a;
  public static final int EXTCODESIZE = 0x3b;
  public static final int EXTCODECOPY = 0x3c;
  public static final int EXTCODEHASH = 0x3f;
  public static final int BLOCKHASH = 0x40;
  public static final int COINBASE = 0x41;
  public static final int TIMESTAMP = 0x42;
  public static final int NUMBER = 0x43;
  public static final int DIFFICULTY = 0x44;
  public static final int GASLIMIT = 0x45;
  public static final int CHAINID = 0x46;
  public static final int SELFBALANCE = 0x47;
  public static final int BASEFEE = 0x48;
  public static final int POP = 0x50;
  public static final int MLOAD = 0x51;
  public static final int MSTORE = 0x52;
  public static final int MSTORE8 = 0x53;
  public static final int SLOAD = 0x54;
  public static final int SSTORE = 0x55;
  public static final int JUMP = 0x56;
  public static final int JUMPI = 0x57;
  public static final int PC = 0x58;
  public static final int MSIZE = 0x59;
  public static final int GAS = 0x5a;
  public static final int JUMPDEST = 0x5b;
  public static final int PUSH1 = 0x60;
  public static final int PUSH2 = 0x61;
  public static final int PUSH3 = 0x62;
  public static final int PUSH4 = 0x63;
  public static final int PUSH5 = 0x64;
  public static final int PUSH6 = 0x65;
  public static final int PUSH7 = 0x66;
  public static final int PUSH8 = 0x67;
  public static final int PUSH9 = 0x68;
  public static final int PUSH10 = 0x69;
  public static final int PUSH11 = 0x6a;
  public static final int PUSH12 = 0x6b;
  public static final int PUSH13 = 0x6c;
  public static final int PUSH14 = 0x6d;
  public static final int PUSH15 = 0x6e;
  public static final int PUSH16 = 0x6f;
  public static final int PUSH17 = 0x70;
  public static final int PUSH18 = 0x71;
  public static final int PUSH19 = 0x72;
  public static final int PUSH20 = 0x73;
  public static final int PUSH21 = 0x74;
  public static final int PUSH22 = 0x75;
  public static final int PUSH23 = 0x76;
  public static final int PUSH24 = 0x77;
  public static final int PUSH25 = 0x78;
  public static final int PUSH26 = 0x79;
  public static final int PUSH27 = 0x7a;
  public static final int PUSH28 = 0x7b;
  public static final int PUSH29 = 0x7c;
  public static final int PUSH30 = 0x7d;
  public static final int PUSH31 = 0x7e;
  public static final int PUSH32 = 0x7f;
  public static final int DUP1 = 0x80;
  public static final int DUP2 = 0x81;
  public static final int DUP3 = 0x82;
  public static final int DUP4 = 0x83;
  public static final int DUP5 = 0x84;
  public static final int DUP6 = 0x85;
  public static final int DUP7 = 0x86;
  public static final int DUP8 = 0x87;
  public static final int DUP9 = 0x88;
  public static final int DUP10 = 0x89;
  public static final int DUP11 = 0x8a;
  public static final int DUP12 = 0x8b;
  public static final int DUP13 = 0x8c;
  public static final int DUP14 = 0x8d;
  public static final int DUP15 = 0x8e;
  public static final int DUP16 = 0x8f;
  public static final int SWAP1 = 0x90;
  public static final int SWAP2 = 0x91;
  public static final int SWAP3 = 0x92;
  public static final int SWAP4 = 0x93;
  public static final int SWAP5 = 0x94;
  public static final int SWAP6 = 0x95;
  public static final int SWAP7 = 0x96;
  public static final int SWAP8 = 0x97;
  public static final int SWAP9 = 0x98;
  public static final int SWAP10 = 0x99;
  public static final int SWAP11 = 0x9a;
  public static final int SWAP12 = 0x9b;
  public static final int SWAP13 = 0x9c;
  public static final int SWAP14 = 0x9d;
  public static final int SWAP15 = 0x9e;
  public static final int SWAP16 = 0x9f;
  public static final int LOG0 = 0xa0;
  public static final int LOG1 = 0xa1;
  public static final int LOG2 = 0xa2;
  public static final int LOG3 = 0xa3;
  public static final int LOG4 = 0xa4;
  public static final int CALLTOKEN = 0xd0;
  public static final int TOKENBALANCE = 0xd1;
  public static final int CALLTOKENVALUE = 0xd2;
  public static final int CALLTOKENID = 0xd3;
  public static final int ISCONTRACT = 0xd4;
  public static final int FREEZE = 0xd5;
  public static final int UNFREEZE = 0xd6;
  public static final int FREEZEEXPIRETIME = 0xd7;
  public static final int VOTEWITNESS = 0xd8;
  public static final int WITHDRAWREWARD = 0xd9;
  public static final int CREATE = 0xf0;
  public static final int CALL = 0xf1;
  public static final int CALLCODE = 0xf2;
  public static final int DELEGATECALL = 0xf4;
  public static final int STATICCALL = 0xfa;
  public static final int RETURN = 0xf3;
  public static final int CREATE2 = 0xf5;
  public static final int REVERT = 0xfd;
  public static final int SUICIDE = 0xff;

  private static final String[] OpName = new String[256];
  static {
    Field[] fields = Op.class.getDeclaredFields();
    for (Field field : fields) {
      if ("int".equals(field.getType().getName())) {
        int op = 0;
        try {
          op = field.getInt(Op.class);
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        }
        OpName[op] = field.getName();
      }
    }
  }

  public static String getOpName(int opCode) {
    return OpName[opCode];
  }
}
