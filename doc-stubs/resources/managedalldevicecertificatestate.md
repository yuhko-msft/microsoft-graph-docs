---
title: "managedAllDeviceCertificateState resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAllDeviceCertificateState resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAllDeviceCertificateStates](../api/managedalldevicecertificatestate-list.md)|[managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) collection|Get a list of the [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) objects and their properties.|
|[Create managedAllDeviceCertificateState](../api/managedalldevicecertificatestate-create.md)|[managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md)|Create a new [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) object.|
|[Get managedAllDeviceCertificateState](../api/managedalldevicecertificatestate-get.md)|[managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md)|Read the properties and relationships of a [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) object.|
|[Update managedAllDeviceCertificateState](../api/managedalldevicecertificatestate-update.md)|[managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md)|Update the properties of a [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) object.|
|[Delete managedAllDeviceCertificateState](../api/managedalldevicecertificatestate-delete.md)|None|Deletes a [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateExpirationDateTime|DateTimeOffset|Certificate expiry date|
|certificateExtendedKeyUsages|String|Enhanced Key Usage|
|certificateIssuanceDateTime|DateTimeOffset|Issuance date|
|certificateIssuerName|String|Issuer|
|certificateKeyUsages|Int32|Key Usage|
|certificateRevokeStatus|certificateRevocationStatus|Revoke status. Possible values are: `none`, `pending`, `issued`, `failed`, `revoked`.|
|certificateRevokeStatusLastChangeDateTime|DateTimeOffset|The time the revoke status was last changed|
|certificateSerialNumber|String|Serial number|
|certificateSubjectName|String|Certificate subject name|
|certificateThumbprint|String|Thumbprint|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceDisplayName|String|Device display name|
|userPrincipalName|String|User principal name|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAllDeviceCertificateState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAllDeviceCertificateState",
  "id": "String (identifier)",
  "certificateExpirationDateTime": "String (timestamp)",
  "certificateExtendedKeyUsages": "String",
  "certificateIssuanceDateTime": "String (timestamp)",
  "certificateIssuerName": "String",
  "certificateKeyUsages": "Integer",
  "certificateRevokeStatus": "String",
  "certificateRevokeStatusLastChangeDateTime": "String (timestamp)",
  "certificateSerialNumber": "String",
  "certificateSubjectName": "String",
  "certificateThumbprint": "String",
  "managedDeviceDisplayName": "String",
  "userPrincipalName": "String"
}
```

