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



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get security](../api/security-get.md)|[security](../resources/security.md)|Read the properties and relationships of a [security](../resources/security.md) object.|
|[Update security](../api/security-update.md)|[security](../resources/security.md)|Update the properties of a [security](../resources/security.md) object.|
|[List cloudAppSecurityProfiles](../api/security-list-cloudappsecurityprofiles.md)|[cloudAppSecurityProfile](../resources/cloudappsecurityprofile.md) collection|Get the cloudAppSecurityProfile resources from the cloudAppSecurityProfiles navigation property.|
|[Create cloudAppSecurityProfile](../api/security-post-cloudappsecurityprofiles.md)|[cloudAppSecurityProfile](../resources/cloudappsecurityprofile.md)|Create a new cloudAppSecurityProfile object.|
|[List domainSecurityProfiles](../api/security-list-domainsecurityprofiles.md)|[domainSecurityProfile](../resources/domainsecurityprofile.md) collection|Get the domainSecurityProfile resources from the domainSecurityProfiles navigation property.|
|[Create domainSecurityProfile](../api/security-post-domainsecurityprofiles.md)|[domainSecurityProfile](../resources/domainsecurityprofile.md)|Create a new domainSecurityProfile object.|
|[List fileSecurityProfiles](../api/security-list-filesecurityprofiles.md)|[fileSecurityProfile](../resources/filesecurityprofile.md) collection|Get the fileSecurityProfile resources from the fileSecurityProfiles navigation property.|
|[Create fileSecurityProfile](../api/security-post-filesecurityprofiles.md)|[fileSecurityProfile](../resources/filesecurityprofile.md)|Create a new fileSecurityProfile object.|
|[List hostSecurityProfiles](../api/security-list-hostsecurityprofiles.md)|[hostSecurityProfile](../resources/hostsecurityprofile.md) collection|Get the hostSecurityProfile resources from the hostSecurityProfiles navigation property.|
|[Create hostSecurityProfile](../api/security-post-hostsecurityprofiles.md)|[hostSecurityProfile](../resources/hostsecurityprofile.md)|Create a new hostSecurityProfile object.|
|[List ipSecurityProfiles](../api/security-list-ipsecurityprofiles.md)|[ipSecurityProfile](../resources/ipsecurityprofile.md) collection|Get the ipSecurityProfile resources from the ipSecurityProfiles navigation property.|
|[Create ipSecurityProfile](../api/security-post-ipsecurityprofiles.md)|[ipSecurityProfile](../resources/ipsecurityprofile.md)|Create a new ipSecurityProfile object.|
|[List providerTenantSettings](../api/security-list-providertenantsettings.md)|[providerTenantSetting](../resources/providertenantsetting.md) collection|Get the providerTenantSetting resources from the providerTenantSettings navigation property.|
|[Create providerTenantSetting](../api/security-post-providertenantsettings.md)|[providerTenantSetting](../resources/providertenantsetting.md)|Create a new providerTenantSetting object.|
|[List securityActions](../api/security-list-securityactions.md)|[securityAction](../resources/securityaction.md) collection|Get the securityAction resources from the securityActions navigation property.|
|[Create securityAction](../api/security-post-securityactions.md)|[securityAction](../resources/securityaction.md)|Create a new securityAction object.|
|[List tiIndicators](../api/security-list-tiindicators.md)|[tiIndicator](../resources/tiindicator.md) collection|Get the tiIndicator resources from the tiIndicators navigation property.|
|[Create tiIndicator](../api/security-post-tiindicators.md)|[tiIndicator](../resources/tiindicator.md)|Create a new tiIndicator object.|
|[List userSecurityProfiles](../api/security-list-usersecurityprofiles.md)|[userSecurityProfile](../resources/usersecurityprofile.md) collection|Get the userSecurityProfile resources from the userSecurityProfiles navigation property.|
|[Create userSecurityProfile](../api/security-post-usersecurityprofiles.md)|[userSecurityProfile](../resources/usersecurityprofile.md)|Create a new userSecurityProfile object.|

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

