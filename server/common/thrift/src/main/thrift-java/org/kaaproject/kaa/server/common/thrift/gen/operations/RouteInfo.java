/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-16")
public class RouteInfo implements org.apache.thrift.TBase<RouteInfo, RouteInfo._Fields>, java.io.Serializable, Cloneable, Comparable<RouteInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RouteInfo");

  private static final org.apache.thrift.protocol.TField UPDATE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("updateType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField EVENT_CLASS_FAMILY_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("eventClassFamilyVersion", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField APPLICATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationToken", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ENDPOINT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("endpointId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RouteInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RouteInfoTupleSchemeFactory());
  }

  /**
   * 
   * @see EventRouteUpdateType
   */
  public EventRouteUpdateType updateType; // required
  public List<EventClassFamilyVersion> eventClassFamilyVersion; // required
  public String applicationToken; // required
  public ByteBuffer endpointId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see EventRouteUpdateType
     */
    UPDATE_TYPE((short)1, "updateType"),
    EVENT_CLASS_FAMILY_VERSION((short)2, "eventClassFamilyVersion"),
    APPLICATION_TOKEN((short)3, "applicationToken"),
    ENDPOINT_ID((short)4, "endpointId");

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
        case 1: // UPDATE_TYPE
          return UPDATE_TYPE;
        case 2: // EVENT_CLASS_FAMILY_VERSION
          return EVENT_CLASS_FAMILY_VERSION;
        case 3: // APPLICATION_TOKEN
          return APPLICATION_TOKEN;
        case 4: // ENDPOINT_ID
          return ENDPOINT_ID;
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

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
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

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UPDATE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("updateType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, EventRouteUpdateType.class)));
    tmpMap.put(_Fields.EVENT_CLASS_FAMILY_VERSION, new org.apache.thrift.meta_data.FieldMetaData("eventClassFamilyVersion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EventClassFamilyVersion.class))));
    tmpMap.put(_Fields.APPLICATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("applicationToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "application_token")));
    tmpMap.put(_Fields.ENDPOINT_ID, new org.apache.thrift.meta_data.FieldMetaData("endpointId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "endpoint_id")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RouteInfo.class, metaDataMap);
  }

  public RouteInfo() {
  }

  public RouteInfo(
    EventRouteUpdateType updateType,
    List<EventClassFamilyVersion> eventClassFamilyVersion,
    String applicationToken,
    ByteBuffer endpointId)
  {
    this();
    this.updateType = updateType;
    this.eventClassFamilyVersion = eventClassFamilyVersion;
    this.applicationToken = applicationToken;
    this.endpointId = org.apache.thrift.TBaseHelper.copyBinary(endpointId);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RouteInfo(RouteInfo other) {
    if (other.isSetUpdateType()) {
      this.updateType = other.updateType;
    }
    if (other.isSetEventClassFamilyVersion()) {
      List<EventClassFamilyVersion> __this__eventClassFamilyVersion = new ArrayList<EventClassFamilyVersion>(other.eventClassFamilyVersion.size());
      for (EventClassFamilyVersion other_element : other.eventClassFamilyVersion) {
        __this__eventClassFamilyVersion.add(new EventClassFamilyVersion(other_element));
      }
      this.eventClassFamilyVersion = __this__eventClassFamilyVersion;
    }
    if (other.isSetApplicationToken()) {
      this.applicationToken = other.applicationToken;
    }
    if (other.isSetEndpointId()) {
      this.endpointId = other.endpointId;
    }
  }

  public RouteInfo deepCopy() {
    return new RouteInfo(this);
  }

  @Override
  public void clear() {
    this.updateType = null;
    this.eventClassFamilyVersion = null;
    this.applicationToken = null;
    this.endpointId = null;
  }

  /**
   * 
   * @see EventRouteUpdateType
   */
  public EventRouteUpdateType getUpdateType() {
    return this.updateType;
  }

  /**
   * 
   * @see EventRouteUpdateType
   */
  public RouteInfo setUpdateType(EventRouteUpdateType updateType) {
    this.updateType = updateType;
    return this;
  }

  public void unsetUpdateType() {
    this.updateType = null;
  }

  /** Returns true if field updateType is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateType() {
    return this.updateType != null;
  }

  public void setUpdateTypeIsSet(boolean value) {
    if (!value) {
      this.updateType = null;
    }
  }

  public int getEventClassFamilyVersionSize() {
    return (this.eventClassFamilyVersion == null) ? 0 : this.eventClassFamilyVersion.size();
  }

  public java.util.Iterator<EventClassFamilyVersion> getEventClassFamilyVersionIterator() {
    return (this.eventClassFamilyVersion == null) ? null : this.eventClassFamilyVersion.iterator();
  }

  public void addToEventClassFamilyVersion(EventClassFamilyVersion elem) {
    if (this.eventClassFamilyVersion == null) {
      this.eventClassFamilyVersion = new ArrayList<EventClassFamilyVersion>();
    }
    this.eventClassFamilyVersion.add(elem);
  }

  public List<EventClassFamilyVersion> getEventClassFamilyVersion() {
    return this.eventClassFamilyVersion;
  }

  public RouteInfo setEventClassFamilyVersion(List<EventClassFamilyVersion> eventClassFamilyVersion) {
    this.eventClassFamilyVersion = eventClassFamilyVersion;
    return this;
  }

  public void unsetEventClassFamilyVersion() {
    this.eventClassFamilyVersion = null;
  }

  /** Returns true if field eventClassFamilyVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetEventClassFamilyVersion() {
    return this.eventClassFamilyVersion != null;
  }

  public void setEventClassFamilyVersionIsSet(boolean value) {
    if (!value) {
      this.eventClassFamilyVersion = null;
    }
  }

  public String getApplicationToken() {
    return this.applicationToken;
  }

  public RouteInfo setApplicationToken(String applicationToken) {
    this.applicationToken = applicationToken;
    return this;
  }

  public void unsetApplicationToken() {
    this.applicationToken = null;
  }

  /** Returns true if field applicationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationToken() {
    return this.applicationToken != null;
  }

  public void setApplicationTokenIsSet(boolean value) {
    if (!value) {
      this.applicationToken = null;
    }
  }

  public byte[] getEndpointId() {
    setEndpointId(org.apache.thrift.TBaseHelper.rightSize(endpointId));
    return endpointId == null ? null : endpointId.array();
  }

  public ByteBuffer bufferForEndpointId() {
    return org.apache.thrift.TBaseHelper.copyBinary(endpointId);
  }

  public RouteInfo setEndpointId(byte[] endpointId) {
    this.endpointId = endpointId == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(endpointId, endpointId.length));
    return this;
  }

  public RouteInfo setEndpointId(ByteBuffer endpointId) {
    this.endpointId = org.apache.thrift.TBaseHelper.copyBinary(endpointId);
    return this;
  }

  public void unsetEndpointId() {
    this.endpointId = null;
  }

  /** Returns true if field endpointId is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpointId() {
    return this.endpointId != null;
  }

  public void setEndpointIdIsSet(boolean value) {
    if (!value) {
      this.endpointId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UPDATE_TYPE:
      if (value == null) {
        unsetUpdateType();
      } else {
        setUpdateType((EventRouteUpdateType)value);
      }
      break;

    case EVENT_CLASS_FAMILY_VERSION:
      if (value == null) {
        unsetEventClassFamilyVersion();
      } else {
        setEventClassFamilyVersion((List<EventClassFamilyVersion>)value);
      }
      break;

    case APPLICATION_TOKEN:
      if (value == null) {
        unsetApplicationToken();
      } else {
        setApplicationToken((String)value);
      }
      break;

    case ENDPOINT_ID:
      if (value == null) {
        unsetEndpointId();
      } else {
        setEndpointId((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATE_TYPE:
      return getUpdateType();

    case EVENT_CLASS_FAMILY_VERSION:
      return getEventClassFamilyVersion();

    case APPLICATION_TOKEN:
      return getApplicationToken();

    case ENDPOINT_ID:
      return getEndpointId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UPDATE_TYPE:
      return isSetUpdateType();
    case EVENT_CLASS_FAMILY_VERSION:
      return isSetEventClassFamilyVersion();
    case APPLICATION_TOKEN:
      return isSetApplicationToken();
    case ENDPOINT_ID:
      return isSetEndpointId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RouteInfo)
      return this.equals((RouteInfo)that);
    return false;
  }

  public boolean equals(RouteInfo that) {
    if (that == null)
      return false;

    boolean this_present_updateType = true && this.isSetUpdateType();
    boolean that_present_updateType = true && that.isSetUpdateType();
    if (this_present_updateType || that_present_updateType) {
      if (!(this_present_updateType && that_present_updateType))
        return false;
      if (!this.updateType.equals(that.updateType))
        return false;
    }

    boolean this_present_eventClassFamilyVersion = true && this.isSetEventClassFamilyVersion();
    boolean that_present_eventClassFamilyVersion = true && that.isSetEventClassFamilyVersion();
    if (this_present_eventClassFamilyVersion || that_present_eventClassFamilyVersion) {
      if (!(this_present_eventClassFamilyVersion && that_present_eventClassFamilyVersion))
        return false;
      if (!this.eventClassFamilyVersion.equals(that.eventClassFamilyVersion))
        return false;
    }

    boolean this_present_applicationToken = true && this.isSetApplicationToken();
    boolean that_present_applicationToken = true && that.isSetApplicationToken();
    if (this_present_applicationToken || that_present_applicationToken) {
      if (!(this_present_applicationToken && that_present_applicationToken))
        return false;
      if (!this.applicationToken.equals(that.applicationToken))
        return false;
    }

    boolean this_present_endpointId = true && this.isSetEndpointId();
    boolean that_present_endpointId = true && that.isSetEndpointId();
    if (this_present_endpointId || that_present_endpointId) {
      if (!(this_present_endpointId && that_present_endpointId))
        return false;
      if (!this.endpointId.equals(that.endpointId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_updateType = true && (isSetUpdateType());
    list.add(present_updateType);
    if (present_updateType)
      list.add(updateType.getValue());

    boolean present_eventClassFamilyVersion = true && (isSetEventClassFamilyVersion());
    list.add(present_eventClassFamilyVersion);
    if (present_eventClassFamilyVersion)
      list.add(eventClassFamilyVersion);

    boolean present_applicationToken = true && (isSetApplicationToken());
    list.add(present_applicationToken);
    if (present_applicationToken)
      list.add(applicationToken);

    boolean present_endpointId = true && (isSetEndpointId());
    list.add(present_endpointId);
    if (present_endpointId)
      list.add(endpointId);

    return list.hashCode();
  }

  @Override
  public int compareTo(RouteInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUpdateType()).compareTo(other.isSetUpdateType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateType, other.updateType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEventClassFamilyVersion()).compareTo(other.isSetEventClassFamilyVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventClassFamilyVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventClassFamilyVersion, other.eventClassFamilyVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationToken()).compareTo(other.isSetApplicationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationToken, other.applicationToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpointId()).compareTo(other.isSetEndpointId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpointId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpointId, other.endpointId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RouteInfo(");
    boolean first = true;

    sb.append("updateType:");
    if (this.updateType == null) {
      sb.append("null");
    } else {
      sb.append(this.updateType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventClassFamilyVersion:");
    if (this.eventClassFamilyVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.eventClassFamilyVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationToken:");
    if (this.applicationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpointId:");
    if (this.endpointId == null) {
      sb.append("null");
    } else {
      sb.append(this.endpointId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RouteInfoStandardSchemeFactory implements SchemeFactory {
    public RouteInfoStandardScheme getScheme() {
      return new RouteInfoStandardScheme();
    }
  }

  private static class RouteInfoStandardScheme extends StandardScheme<RouteInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RouteInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UPDATE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.updateType = org.kaaproject.kaa.server.common.thrift.gen.operations.EventRouteUpdateType.findByValue(iprot.readI32());
              struct.setUpdateTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EVENT_CLASS_FAMILY_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.eventClassFamilyVersion = new ArrayList<EventClassFamilyVersion>(_list0.size);
                EventClassFamilyVersion _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new EventClassFamilyVersion();
                  _elem1.read(iprot);
                  struct.eventClassFamilyVersion.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setEventClassFamilyVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APPLICATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationToken = iprot.readString();
              struct.setApplicationTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ENDPOINT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.endpointId = iprot.readBinary();
              struct.setEndpointIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RouteInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updateType != null) {
        oprot.writeFieldBegin(UPDATE_TYPE_FIELD_DESC);
        oprot.writeI32(struct.updateType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.eventClassFamilyVersion != null) {
        oprot.writeFieldBegin(EVENT_CLASS_FAMILY_VERSION_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.eventClassFamilyVersion.size()));
          for (EventClassFamilyVersion _iter3 : struct.eventClassFamilyVersion)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.applicationToken != null) {
        oprot.writeFieldBegin(APPLICATION_TOKEN_FIELD_DESC);
        oprot.writeString(struct.applicationToken);
        oprot.writeFieldEnd();
      }
      if (struct.endpointId != null) {
        oprot.writeFieldBegin(ENDPOINT_ID_FIELD_DESC);
        oprot.writeBinary(struct.endpointId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RouteInfoTupleSchemeFactory implements SchemeFactory {
    public RouteInfoTupleScheme getScheme() {
      return new RouteInfoTupleScheme();
    }
  }

  private static class RouteInfoTupleScheme extends TupleScheme<RouteInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RouteInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUpdateType()) {
        optionals.set(0);
      }
      if (struct.isSetEventClassFamilyVersion()) {
        optionals.set(1);
      }
      if (struct.isSetApplicationToken()) {
        optionals.set(2);
      }
      if (struct.isSetEndpointId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUpdateType()) {
        oprot.writeI32(struct.updateType.getValue());
      }
      if (struct.isSetEventClassFamilyVersion()) {
        {
          oprot.writeI32(struct.eventClassFamilyVersion.size());
          for (EventClassFamilyVersion _iter4 : struct.eventClassFamilyVersion)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetApplicationToken()) {
        oprot.writeString(struct.applicationToken);
      }
      if (struct.isSetEndpointId()) {
        oprot.writeBinary(struct.endpointId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RouteInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.updateType = org.kaaproject.kaa.server.common.thrift.gen.operations.EventRouteUpdateType.findByValue(iprot.readI32());
        struct.setUpdateTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.eventClassFamilyVersion = new ArrayList<EventClassFamilyVersion>(_list5.size);
          EventClassFamilyVersion _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new EventClassFamilyVersion();
            _elem6.read(iprot);
            struct.eventClassFamilyVersion.add(_elem6);
          }
        }
        struct.setEventClassFamilyVersionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.applicationToken = iprot.readString();
        struct.setApplicationTokenIsSet(true);
      }
      if (incoming.get(3)) {
        struct.endpointId = iprot.readBinary();
        struct.setEndpointIdIsSet(true);
      }
    }
  }

}

