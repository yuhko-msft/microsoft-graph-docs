---
title: "security resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# security resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get security](../api/security-get.md)|[security](../resources/security.md)|Read the properties and relationships of a [security](../resources/security.md) object.|
|[Update security](../api/security-update.md)|[security](../resources/security.md)|Update the properties of a [security](../resources/security.md) object.|
|[List incidents](../api/security-list-incidents.md)|[incident](../resources/incident.md) collection|Get the incident resources from the incidents navigation property.|
|[Create incident](../api/security-post-incidents.md)|[incident](../resources/incident.md)|Create a new incident object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|providerStatus|[securityProviderStatus](../resources/securityproviderstatus.md) collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|alerts|[alert](../resources/alert.md) collection|**TODO: Add Description**|
|cloudAppSecurityProfiles|[cloudAppSecurityProfile](../resources/cloudappsecurityprofile.md) collection|**TODO: Add Description**|
|domainSecurityProfiles|[domainSecurityProfile](../resources/domainsecurityprofile.md) collection|**TODO: Add Description**|
|fileSecurityProfiles|[fileSecurityProfile](../resources/filesecurityprofile.md) collection|**TODO: Add Description**|
|hostSecurityProfiles|[hostSecurityProfile](../resources/hostsecurityprofile.md) collection|**TODO: Add Description**|
|incidents|[incident](../resources/incident.md) collection|**TODO: Add Description**|
|ipSecurityProfiles|[ipSecurityProfile](../resources/ipsecurityprofile.md) collection|**TODO: Add Description**|
|providerTenantSettings|[providerTenantSetting](../resources/providertenantsetting.md) collection|**TODO: Add Description**|
|secureScoreControlProfiles|[secureScoreControlProfile](../resources/securescorecontrolprofile.md) collection|**TODO: Add Description**|
|secureScores|[secureScore](../resources/securescore.md) collection|**TODO: Add Description**|
|securityActions|[securityAction](../resources/securityaction.md) collection|**TODO: Add Description**|
|tiIndicators|[tiIndicator](../resources/tiindicator.md) collection|**TODO: Add Description**|
|userSecurityProfiles|[userSecurityProfile](../resources/usersecurityprofile.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.security",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.security",
  "providerStatus": [
    {
      "@odata.type": "microsoft.graph.securityProviderStatus"
    }
  ]
}
```

