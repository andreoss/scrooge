/**
 * Autogenerated by Scrooge
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftandroid;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class RequestUnion extends TUnion<RequestUnion, RequestUnion._Fields> {
  private static final TStruct STRUCT_DESC = new TStruct("RequestUnion");

  private static final TField ID_FIELD_DESC = new TField("id", TType.I32, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name");
  
    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();
  
    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        default:
          return null;
      }
    }
  
    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }
  
    private final short _thriftId;
    private final String _fieldName;
  
    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }
  
    public short getThriftFieldId() {
      return _thriftId;
    }
  
    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new FieldMetaData("id", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(RequestUnion.class, metaDataMap);
  }

  public static final _Fields ID = _Fields.ID;
  public static final _Fields NAME = _Fields.NAME;


  public RequestUnion() {
    super();
  }

  public RequestUnion(_Fields setField, Object value) {
    super(setField, value);
  }

  public RequestUnion(RequestUnion other) {
    super(other);
  }

  public static List<String> validateNewInstance(RequestUnion item) {
    final List<String> buf = new ArrayList<String>();
    final TFieldIdEnum setField = item.getSetField();

    if (setField != null) {
      final short thriftFieldId = setField.getThriftFieldId();
    } else {
      buf.add("No fields set for union type 'RequestUnion'.");
    }

    return buf;
  }

  public RequestUnion deepCopy() {
    return new RequestUnion(this);
  }

  @java.lang.Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case ID:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'id', but got " + value.getClass().getSimpleName());
      case NAME:
        if (value instanceof String) {
          break;
        }
        throw new ClassCastException("Was expecting value of type String for field 'name', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  protected Object standardSchemeReadValue(TProtocol iprot, TField field) throws TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case ID:
          if (field.type == ID_FIELD_DESC.type) {
            Integer id;
            id = iprot.readI32();

            return id;
          } else {
            TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NAME:
          if (field.type == NAME_FIELD_DESC.type) {
            String name;
            name = iprot.readString();

            return name;
          } else {
            TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  protected void standardSchemeWriteValue(TProtocol oprot) throws TException {
    switch (setField_) {
      case ID:
        Integer id = (Integer)value_;
        oprot.writeI32(id);

        return;
      case NAME:
        String name = (String)value_;
        oprot.writeString(name);

        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @java.lang.Override
  protected Object tupleSchemeReadValue(TProtocol iprot, short fieldID) throws TException {
    throw new UnsupportedOperationException("tuple scheme not implemented");
  }

  @java.lang.Override
  protected void tupleSchemeWriteValue(TProtocol oprot) throws TException {
    throw new UnsupportedOperationException("tuple scheme not implemented");
  }

  @java.lang.Override
  protected TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case ID:
        return ID_FIELD_DESC;
      case NAME:
        return NAME_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @java.lang.Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @java.lang.Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public boolean equals(Object other) {
    if (other instanceof RequestUnion) {
      return equals((RequestUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(RequestUnion other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @java.lang.Override
  public int compareTo(RequestUnion other) {
    int lastComparison = TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  public int hashCode() {
    int hashCode = this.getClass().getName().hashCode();
    TFieldIdEnum setField = getSetField();

    if (setField != null) {
      final short thriftFieldId = setField.getThriftFieldId();
      hashCode = hashCode * 31 + thriftFieldId;

      if (1 == thriftFieldId  && true) {
        hashCode = 31 * hashCode + ((Integer)getFieldValue()).hashCode();
      }
      if (2 == thriftFieldId  && true && (isSet(_Fields.NAME))) {
        hashCode = 31 * hashCode + ((String)getFieldValue()).hashCode();
      }
    }
    return hashCode;
  }
}

