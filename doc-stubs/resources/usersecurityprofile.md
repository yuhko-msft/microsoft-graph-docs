---
title: "userSecurityProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userSecurityProfile resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userSecurityProfiles](../api/usersecurityprofile-list.md)|[userSecurityProfile](../resources/usersecurityprofile.md) collection|Get a list of the [userSecurityProfile](../resources/usersecurityprofile.md) objects and their properties.|
|[Create userSecurityProfile](../api/usersecurityprofile-create.md)|[userSecurityProfile](../resources/usersecurityprofile.md)|Create a new [userSecurityProfile](../resources/usersecurityprofile.md) object.|
|[Get userSecurityProfile](../api/usersecurityprofile-get.md)|[userSecurityProfile](../resources/usersecurityprofile.md)|Read the properties and relationships of a [userSecurityProfile](../resources/usersecurityprofile.md) object.|
|[Update userSecurityProfile](../api/usersecurityprofile-update.md)|[userSecurityProfile](../resources/usersecurityprofile.md)|Update the properties of a [userSecurityProfile](../resources/usersecurityprofile.md) object.|
|[Delete userSecurityProfile](../api/usersecurityprofile-delete.md)|None|Deletes a [userSecurityProfile](../resources/usersecurityprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accounts|[userAccount](../resources/useraccount.md) collection|**TODO: Add Description**|
|azureSubscriptionId|String|**TODO: Add Description**|
|azureTenantId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|riskScore|String|**TODO: Add Description**|
|tags|String collection|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|vendorInformation|[securityVendorInformation](../resources/securityvendorinformation.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userSecurityProfile",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userSecurityProfile",
  "id": "String (identifier)",
  "accounts": [
    {
      "@odata.type": "microsoft.graph.userAccount"
    }
  ],
  "azureSubscriptionId": "String",
  "azureTenantId": "String",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "riskScore": "String",
  "tags": [
    "String"
  ],
  "userPrincipalName": "String",
  "vendorInformation": {
    "@odata.type": "microsoft.graph.securityVendorInformation"
  }
}
```

