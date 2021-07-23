---
title: "androidManagedStoreAccountEnterpriseSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidManagedStoreAccountEnterpriseSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidManagedStoreAccountEnterpriseSettings](../api/intune-androidmanagedstoreaccountenterprisesettings-list.md)|[androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md) collection|Get a list of the [androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md) objects and their properties.|
|[Create androidManagedStoreAccountEnterpriseSettings](../api/intune-androidmanagedstoreaccountenterprisesettings-create.md)|[androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md)|Create a new [androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md) object.|
|[Get androidManagedStoreAccountEnterpriseSettings](../api/intune-androidmanagedstoreaccountenterprisesettings-get.md)|[androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md)|Read the properties and relationships of an [androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md) object.|
|[Update androidManagedStoreAccountEnterpriseSettings](../api/intune-androidmanagedstoreaccountenterprisesettings-update.md)|[androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md)|Update the properties of an [androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md) object.|
|[Delete androidManagedStoreAccountEnterpriseSettings](../api/intune-androidmanagedstoreaccountenterprisesettings-delete.md)|None|Deletes an [androidManagedStoreAccountEnterpriseSettings](../resources/intune-androidmanagedstoreaccountenterprisesettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidDeviceOwnerFullyManagedEnrollmentEnabled|Boolean|**TODO: Add Description**|
|bindStatus|androidManagedStoreAccountBindStatus|**TODO: Add Description**. Possible values are: `notBound`, `bound`, `boundAndValidated`, `unbinding`.|
|companyCodes|[androidEnrollmentCompanyCode](../resources/intune-androidenrollmentcompanycode.md) collection|**TODO: Add Description**|
|deviceOwnerManagementEnabled|Boolean|**TODO: Add Description**|
|enrollmentTarget|androidManagedStoreAccountEnrollmentTarget|**TODO: Add Description**. Possible values are: `none`, `all`, `targeted`, `targetedAsEnrollmentRestrictions`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastAppSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|lastAppSyncStatus|androidManagedStoreAccountAppSyncStatus|**TODO: Add Description**. Possible values are: `success`, `credentialsNotValid`, `androidForWorkApiError`, `managementServiceError`, `unknownError`, `none`.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|managedGooglePlayInitialScopeTagIds|String collection|**TODO: Add Description**|
|ownerOrganizationName|String|**TODO: Add Description**|
|ownerUserPrincipalName|String|**TODO: Add Description**|
|targetGroupIds|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidManagedStoreAccountEnterpriseSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidManagedStoreAccountEnterpriseSettings",
  "id": "String (identifier)",
  "bindStatus": "String",
  "lastAppSyncDateTime": "String (timestamp)",
  "lastAppSyncStatus": "String",
  "ownerUserPrincipalName": "String",
  "ownerOrganizationName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "enrollmentTarget": "String",
  "targetGroupIds": [
    "String"
  ],
  "deviceOwnerManagementEnabled": "Boolean",
  "companyCodes": [
    {
      "@odata.type": "microsoft.graph.androidEnrollmentCompanyCode"
    }
  ],
  "androidDeviceOwnerFullyManagedEnrollmentEnabled": "Boolean",
  "managedGooglePlayInitialScopeTagIds": [
    "String"
  ]
}
```

