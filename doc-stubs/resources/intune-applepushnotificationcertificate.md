---
title: "applePushNotificationCertificate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# applePushNotificationCertificate resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List applePushNotificationCertificates](../api/intune-applepushnotificationcertificate-list.md)|[applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md) collection|Get a list of the [applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md) objects and their properties.|
|[Create applePushNotificationCertificate](../api/intune-applepushnotificationcertificate-create.md)|[applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md)|Create a new [applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md) object.|
|[Get applePushNotificationCertificate](../api/intune-applepushnotificationcertificate-get.md)|[applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md)|Read the properties and relationships of an [applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md) object.|
|[Update applePushNotificationCertificate](../api/intune-applepushnotificationcertificate-update.md)|[applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md)|Update the properties of an [applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md) object.|
|[Delete applePushNotificationCertificate](../api/intune-applepushnotificationcertificate-delete.md)|None|Deletes an [applePushNotificationCertificate](../resources/intune-applepushnotificationcertificate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appleIdentifier|String|**TODO: Add Description**|
|certificate|String|**TODO: Add Description**|
|certificateSerialNumber|String|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|topicIdentifier|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.applePushNotificationCertificate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.applePushNotificationCertificate",
  "id": "String (identifier)",
  "appleIdentifier": "String",
  "topicIdentifier": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "expirationDateTime": "String (timestamp)",
  "certificateSerialNumber": "String",
  "certificate": "String"
}
```

