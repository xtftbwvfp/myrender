/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: G:\\projects\\MJ\\MojingSDK\\Core\\VrService\\src\\com\\baofeng\\mojing\\service\\IServiceResponse.aidl
 */
package com.baofeng.mojing.service;
public interface IServiceResponse extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.baofeng.mojing.service.IServiceResponse
{
private static final java.lang.String DESCRIPTOR = "com.baofeng.mojing.service.IServiceResponse";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.baofeng.mojing.service.IServiceResponse interface,
 * generating a proxy if needed.
 */
public static com.baofeng.mojing.service.IServiceResponse asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.baofeng.mojing.service.IServiceResponse))) {
return ((com.baofeng.mojing.service.IServiceResponse)iin);
}
return new com.baofeng.mojing.service.IServiceResponse.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_sensorSuccess:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sensorSuccess(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sensorFailed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sensorFailed(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sensorStarted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.sensorStarted(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sensorStopped:
{
data.enforceInterface(DESCRIPTOR);
this.sensorStopped();
reply.writeNoException();
return true;
}
case TRANSACTION_event:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.event(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onControllerData:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
this.onControllerData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onControllerConnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onControllerConnect(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onControllerDisconnect:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onControllerDisconnect(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.baofeng.mojing.service.IServiceResponse
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void sensorSuccess(java.lang.String params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(params);
mRemote.transact(Stub.TRANSACTION_sensorSuccess, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sensorFailed(java.lang.String params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(params);
mRemote.transact(Stub.TRANSACTION_sensorFailed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sensorStarted(java.lang.String params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(params);
mRemote.transact(Stub.TRANSACTION_sensorStarted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sensorStopped() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_sensorStopped, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void event(java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_event, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onControllerData(int id, byte[] data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
_data.writeByteArray(data);
mRemote.transact(Stub.TRANSACTION_onControllerData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onControllerConnect(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_onControllerConnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onControllerDisconnect(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_onControllerDisconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_sensorSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sensorFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_sensorStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sensorStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_event = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onControllerData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onControllerConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onControllerDisconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void sensorSuccess(java.lang.String params) throws android.os.RemoteException;
public void sensorFailed(java.lang.String params) throws android.os.RemoteException;
public void sensorStarted(java.lang.String params) throws android.os.RemoteException;
public void sensorStopped() throws android.os.RemoteException;
public void event(java.lang.String data) throws android.os.RemoteException;
public void onControllerData(int id, byte[] data) throws android.os.RemoteException;
public void onControllerConnect(int id) throws android.os.RemoteException;
public void onControllerDisconnect(int id) throws android.os.RemoteException;
}
