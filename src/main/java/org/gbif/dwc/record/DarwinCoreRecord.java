package org.gbif.dwc.record;

import org.gbif.dwc.terms.DwcTerm;

/**
 * A bean representing a simple Darwin Core record with a property for each dwc term apart from terms of group
 * MeasurementOrFact or ResourceRelationship.
 */
public class DarwinCoreRecord extends DarwinCoreTaxon {

  private String id;
  private String associatedMedia;
  private String associatedOccurrences;
  private String associatedOrganisms;
  private String associatedReferences;
  private String associatedSequences;
  private String associatedTaxa;
  private String bed;
  private String behavior;
  private String catalogNumber;
  private String continent;
  private String coordinatePrecision;
  private String coordinateUncertaintyInMeters;
  private String country;
  private String countryCode;
  private String county;
  private String dateIdentified;
  private String day;
  private String decimalLatitude;
  private String decimalLongitude;
  private String disposition;
  private String earliestAgeOrLowestStage;
  private String earliestEonOrLowestEonothem;
  private String earliestEpochOrLowestSeries;
  private String earliestEraOrLowestErathem;
  private String earliestPeriodOrLowestSystem;
  private String endDayOfYear;
  private String establishmentMeans;
  private String eventDate;
  private String eventID;
  private String eventRemarks;
  private String eventTime;
  private String fieldNotes;
  private String fieldNumber;
  private String footprintSpatialFit;
  private String footprintSRS;
  private String footprintWKT;
  private String formation;
  private String geodeticDatum;
  private String geologicalContextID;
  private String georeferencedBy;
  private String georeferencedDate;
  private String georeferenceProtocol;
  private String georeferenceRemarks;
  private String georeferenceSources;
  private String georeferenceVerificationStatus;
  private String group;
  private String habitat;
  private String higherGeography;
  private String higherGeographyID;
  private String highestBiostratigraphicZone;
  private String identificationID;
  private String identificationQualifier;
  private String identificationReferences;
  private String identificationRemarks;
  private String identificationVerificationStatus;
  private String identifiedBy;
  private String individualCount;
  private String island;
  private String islandGroup;
  private String latestAgeOrHighestStage;
  private String latestEonOrHighestEonothem;
  private String latestEpochOrHighestSeries;
  private String latestEraOrHighestErathem;
  private String latestPeriodOrHighestSystem;
  private String lifeStage;
  private String lithostratigraphicTerms;
  private String locality;
  private String locationAccordingTo;
  private String locationID;
  private String locationRemarks;
  private String lowestBiostratigraphicZone;
  private String materialSampleID;
  private String maximumDepthInMeters;
  private String maximumDistanceAboveSurfaceInMeters;
  private String maximumElevationInMeters;
  private String member;
  private String minimumDepthInMeters;
  private String minimumDistanceAboveSurfaceInMeters;
  private String minimumElevationInMeters;
  private String month;
  private String municipality;
  private String occurrenceID;
  private String occurrenceRemarks;
  private String occurrenceStatus;
  private String organismID;
  private String organismName;
  private String organismRemarks;
  private String organismScope;
  private String otherCatalogNumbers;
  private String pointRadiusSpatialFit;
  private String preparations;
  private String previousIdentifications;
  private String recordedBy;
  private String recordNumber;
  private String reproductiveCondition;
  private String samplingEffort;
  private String samplingProtocol;
  private String sex;
  private String startDayOfYear;
  private String stateProvince;
  private String typeStatus;
  private String verbatimCoordinates;
  private String verbatimCoordinateSystem;
  private String verbatimDepth;
  private String verbatimElevation;
  private String verbatimEventDate;
  private String verbatimLatitude;
  private String verbatimLocality;
  private String verbatimLongitude;
  private String verbatimSRS;
  private String waterBody;
  private String year;

  /**
   * Resets all properties to NULL.
   */
  @Override
  public void clear() {
    super.clear();
    id = null;
    for (DwcTerm t : DwcTerm.values()) {
      setProperty(t, null);
    }
  }

  /**
   * @return the identifier for this record
   */
  public String id() {
    return id;
  }

  /**
   * @return the identifier for this record
   */
  public String getId() {
    return id;
  }

  /**
   * sets the identifier for this record
   */
  public void setId(String id) {
    this.id = id;
  }

  public String getAssociatedMedia() {
    return associatedMedia;
  }

  public String getAssociatedOccurrences() {
    return associatedOccurrences;
  }

  public String getAssociatedOrganisms() {
    return associatedOrganisms;
  }

  public String getAssociatedReferences() {
    return associatedReferences;
  }

  public String getAssociatedSequences() {
    return associatedSequences;
  }

  public String getAssociatedTaxa() {
    return associatedTaxa;
  }

  public String getBed() {
    return bed;
  }

  public String getBehavior() {
    return behavior;
  }

  public String getCatalogNumber() {
    return catalogNumber;
  }

  public String getContinent() {
    return continent;
  }

  public String getCoordinatePrecision() {
    return coordinatePrecision;
  }

  public String getCoordinateUncertaintyInMeters() {
    return coordinateUncertaintyInMeters;
  }

  public String getCountry() {
    return country;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public String getCounty() {
    return county;
  }

  public String getDateIdentified() {
    return dateIdentified;
  }

  public String getDay() {
    return day;
  }

  public String getDecimalLatitude() {
    return decimalLatitude;
  }

  public String getDecimalLongitude() {
    return decimalLongitude;
  }

  public String getDisposition() {
    return disposition;
  }

  public String getEarliestAgeOrLowestStage() {
    return earliestAgeOrLowestStage;
  }

  public String getEarliestEonOrLowestEonothem() {
    return earliestEonOrLowestEonothem;
  }

  public String getEarliestEpochOrLowestSeries() {
    return earliestEpochOrLowestSeries;
  }

  public String getEarliestEraOrLowestErathem() {
    return earliestEraOrLowestErathem;
  }

  public String getEarliestPeriodOrLowestSystem() {
    return earliestPeriodOrLowestSystem;
  }

  public String getEndDayOfYear() {
    return endDayOfYear;
  }

  public String getEstablishmentMeans() {
    return establishmentMeans;
  }

  public String getEventDate() {
    return eventDate;
  }

  public String getEventID() {
    return eventID;
  }

  public String getEventRemarks() {
    return eventRemarks;
  }

  public String getEventTime() {
    return eventTime;
  }

  public String getFieldNotes() {
    return fieldNotes;
  }

  public String getFieldNumber() {
    return fieldNumber;
  }

  public String getFootprintSpatialFit() {
    return footprintSpatialFit;
  }

  public String getFootprintSRS() {
    return footprintSRS;
  }

  public String getFootprintWKT() {
    return footprintWKT;
  }

  public String getFormation() {
    return formation;
  }

  public String getGeodeticDatum() {
    return geodeticDatum;
  }

  public String getGeologicalContextID() {
    return geologicalContextID;
  }

  public String getGeoreferencedBy() {
    return georeferencedBy;
  }

  public String getGeoreferencedDate() {
    return georeferencedDate;
  }

  public String getGeoreferenceProtocol() {
    return georeferenceProtocol;
  }

  public String getGeoreferenceRemarks() {
    return georeferenceRemarks;
  }

  public String getGeoreferenceSources() {
    return georeferenceSources;
  }

  public String getGeoreferenceVerificationStatus() {
    return georeferenceVerificationStatus;
  }

  public String getGroup() {
    return group;
  }

  public String getHabitat() {
    return habitat;
  }

  public String getHigherGeography() {
    return higherGeography;
  }

  public String getHigherGeographyID() {
    return higherGeographyID;
  }

  public String getHighestBiostratigraphicZone() {
    return highestBiostratigraphicZone;
  }

  public String getIdentificationID() {
    return identificationID;
  }

  public String getIdentificationQualifier() {
    return identificationQualifier;
  }

  public String getIdentificationReferences() {
    return identificationReferences;
  }

  public String getIdentificationRemarks() {
    return identificationRemarks;
  }

  public String getIdentificationVerificationStatus() {
    return identificationVerificationStatus;
  }

  public String getIdentifiedBy() {
    return identifiedBy;
  }

  public String getIndividualCount() {
    return individualCount;
  }

  public String getIsland() {
    return island;
  }

  public String getIslandGroup() {
    return islandGroup;
  }

  public String getLatestAgeOrHighestStage() {
    return latestAgeOrHighestStage;
  }

  public String getLatestEonOrHighestEonothem() {
    return latestEonOrHighestEonothem;
  }

  public String getLatestEpochOrHighestSeries() {
    return latestEpochOrHighestSeries;
  }

  public String getLatestEraOrHighestErathem() {
    return latestEraOrHighestErathem;
  }

  public String getLatestPeriodOrHighestSystem() {
    return latestPeriodOrHighestSystem;
  }

  public String getLifeStage() {
    return lifeStage;
  }

  public String getLithostratigraphicTerms() {
    return lithostratigraphicTerms;
  }

  public String getLocality() {
    return locality;
  }

  public String getLocationAccordingTo() {
    return locationAccordingTo;
  }

  public String getLocationID() {
    return locationID;
  }

  public String getLocationRemarks() {
    return locationRemarks;
  }

  public String getLowestBiostratigraphicZone() {
    return lowestBiostratigraphicZone;
  }

  public String getMaterialSampleID() {
    return materialSampleID;
  }

  public String getMaximumDepthInMeters() {
    return maximumDepthInMeters;
  }

  public String getMaximumDistanceAboveSurfaceInMeters() {
    return maximumDistanceAboveSurfaceInMeters;
  }

  public String getMaximumElevationInMeters() {
    return maximumElevationInMeters;
  }

  public String getMember() {
    return member;
  }

  public String getMinimumDepthInMeters() {
    return minimumDepthInMeters;
  }

  public String getMinimumDistanceAboveSurfaceInMeters() {
    return minimumDistanceAboveSurfaceInMeters;
  }

  public String getMinimumElevationInMeters() {
    return minimumElevationInMeters;
  }

  public String getMonth() {
    return month;
  }

  public String getMunicipality() {
    return municipality;
  }

  public String getOccurrenceID() {
    return occurrenceID;
  }

  public String getOccurrenceRemarks() {
    return occurrenceRemarks;
  }

  public String getOccurrenceStatus() {
    return occurrenceStatus;
  }

  public String getOrganismID() {
    return organismID;
  }

  public String getOrganismName() {
    return organismName;
  }

  public String getOrganismRemarks() {
    return organismRemarks;
  }

  public String getOrganismScope() {
    return organismScope;
  }

  public String getOtherCatalogNumbers() {
    return otherCatalogNumbers;
  }

  public String getPointRadiusSpatialFit() {
    return pointRadiusSpatialFit;
  }

  public String getPreparations() {
    return preparations;
  }

  public String getPreviousIdentifications() {
    return previousIdentifications;
  }

  public String getRecordedBy() {
    return recordedBy;
  }

  public String getRecordNumber() {
    return recordNumber;
  }

  public String getReproductiveCondition() {
    return reproductiveCondition;
  }

  public String getSamplingEffort() {
    return samplingEffort;
  }

  public String getSamplingProtocol() {
    return samplingProtocol;
  }

  public String getSex() {
    return sex;
  }

  public String getStartDayOfYear() {
    return startDayOfYear;
  }

  public String getStateProvince() {
    return stateProvince;
  }

  public String getTypeStatus() {
    return typeStatus;
  }

  public String getVerbatimCoordinates() {
    return verbatimCoordinates;
  }

  public String getVerbatimCoordinateSystem() {
    return verbatimCoordinateSystem;
  }

  public String getVerbatimDepth() {
    return verbatimDepth;
  }

  public String getVerbatimElevation() {
    return verbatimElevation;
  }

  public String getVerbatimEventDate() {
    return verbatimEventDate;
  }

  public String getVerbatimLatitude() {
    return verbatimLatitude;
  }

  public String getVerbatimLocality() {
    return verbatimLocality;
  }

  public String getVerbatimLongitude() {
    return verbatimLongitude;
  }

  public String getVerbatimSRS() {
    return verbatimSRS;
  }

  public String getWaterBody() {
    return waterBody;
  }

  public String getYear() {
    return year;
  }

  public void setAssociatedMedia(String associatedMedia) {
    this.associatedMedia = norm(associatedMedia);
  }

  public void setAssociatedOccurrences(String associatedOccurrences) {
    this.associatedOccurrences = norm(associatedOccurrences);
  }

  public void setAssociatedOrganisms(String associatedOrganisms) {
    this.associatedOrganisms = norm(associatedOrganisms);
  }

  public void setAssociatedReferences(String associatedReferences) {
    this.associatedReferences = norm(associatedReferences);
  }

  public void setAssociatedSequences(String associatedSequences) {
    this.associatedSequences = norm(associatedSequences);
  }

  public void setAssociatedTaxa(String associatedTaxa) {
    this.associatedTaxa = norm(associatedTaxa);
  }

  public void setBed(String bed) {
    this.bed = bed;
  }

  public void setBehavior(String behavior) {
    this.behavior = norm(behavior);
  }

  public void setCatalogNumber(String catalogNumber) {
    this.catalogNumber = norm(catalogNumber);
  }

  public void setContinent(String continent) {
    this.continent = norm(continent);
  }

  public void setCoordinatePrecision(String coordinatePrecision) {
    this.coordinatePrecision = norm(coordinatePrecision);
  }

  public void setCoordinateUncertaintyInMeters(String coordinateUncertaintyInMeters) {
    this.coordinateUncertaintyInMeters = norm(coordinateUncertaintyInMeters);
  }

  public void setCountry(String country) {
    this.country = norm(country);
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = norm(countryCode);
  }

  public void setCounty(String county) {
    this.county = norm(county);
  }

  public void setDateIdentified(String dateIdentified) {
    this.dateIdentified = norm(dateIdentified);
  }

  public void setDay(String day) {
    this.day = norm(day);
  }

  public void setDecimalLatitude(String decimalLatitude) {
    this.decimalLatitude = norm(decimalLatitude);
  }

  public void setDecimalLongitude(String decimalLongitude) {
    this.decimalLongitude = norm(decimalLongitude);
  }

  public void setDisposition(String disposition) {
    this.disposition = norm(disposition);
  }

  public void setEarliestAgeOrLowestStage(String earliestAgeOrLowestStage) {
    this.earliestAgeOrLowestStage = earliestAgeOrLowestStage;
  }

  public void setEarliestEonOrLowestEonothem(String earliestEonOrLowestEonothem) {
    this.earliestEonOrLowestEonothem = earliestEonOrLowestEonothem;
  }

  public void setEarliestEpochOrLowestSeries(String earliestEpochOrLowestSeries) {
    this.earliestEpochOrLowestSeries = earliestEpochOrLowestSeries;
  }

  public void setEarliestEraOrLowestErathem(String earliestEraOrLowestErathem) {
    this.earliestEraOrLowestErathem = earliestEraOrLowestErathem;
  }

  public void setEarliestPeriodOrLowestSystem(String earliestPeriodOrLowestSystem) {
    this.earliestPeriodOrLowestSystem = earliestPeriodOrLowestSystem;
  }

  public void setEndDayOfYear(String endDayOfYear) {
    this.endDayOfYear = norm(endDayOfYear);
  }

  public void setEstablishmentMeans(String establishmentMeans) {
    this.establishmentMeans = norm(establishmentMeans);
  }

  public void setEventDate(String eventDate) {
    this.eventDate = norm(eventDate);
  }

  public void setEventID(String eventID) {
    this.eventID = norm(eventID);
  }

  public void setEventRemarks(String eventRemarks) {
    this.eventRemarks = norm(eventRemarks);
  }

  public void setEventTime(String eventTime) {
    this.eventTime = norm(eventTime);
  }

  public void setFieldNotes(String fieldNotes) {
    this.fieldNotes = norm(fieldNotes);
  }

  public void setFieldNumber(String fieldNumber) {
    this.fieldNumber = norm(fieldNumber);
  }

  public void setFootprintSpatialFit(String footprintSpatialFit) {
    this.footprintSpatialFit = norm(footprintSpatialFit);
  }

  public void setFootprintSRS(String footprintSRS) {
    this.footprintSRS = footprintSRS;
  }

  public void setFootprintWKT(String footprintWKT) {
    this.footprintWKT = norm(footprintWKT);
  }

  public void setFormation(String formation) {
    this.formation = formation;
  }

  public void setGeodeticDatum(String geodeticDatum) {
    this.geodeticDatum = norm(geodeticDatum);
  }

  public void setGeologicalContextID(String geologicalContextID) {
    this.geologicalContextID = geologicalContextID;
  }

  public void setGeoreferencedBy(String georeferencedBy) {
    this.georeferencedBy = norm(georeferencedBy);
  }

  public void setGeoreferencedDate(String georeferencedDate) {
    this.georeferencedDate = georeferencedDate;
  }

  public void setGeoreferenceProtocol(String georeferenceProtocol) {
    this.georeferenceProtocol = norm(georeferenceProtocol);
  }

  public void setGeoreferenceRemarks(String georeferenceRemarks) {
    this.georeferenceRemarks = norm(georeferenceRemarks);
  }

  public void setGeoreferenceSources(String georeferenceSources) {
    this.georeferenceSources = norm(georeferenceSources);
  }

  public void setGeoreferenceVerificationStatus(String georeferenceVerificationStatus) {
    this.georeferenceVerificationStatus = norm(georeferenceVerificationStatus);
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void setHabitat(String habitat) {
    this.habitat = norm(habitat);
  }

  public void setHigherGeography(String higherGeography) {
    this.higherGeography = norm(higherGeography);
  }

  public void setHigherGeographyID(String higherGeographyID) {
    this.higherGeographyID = norm(higherGeographyID);
  }

  public void setHighestBiostratigraphicZone(String highestBiostratigraphicZone) {
    this.highestBiostratigraphicZone = highestBiostratigraphicZone;
  }

  public void setIdentificationID(String identificationID) {
    this.identificationID = norm(identificationID);
  }

  public void setIdentificationQualifier(String identificationQualifier) {
    this.identificationQualifier = norm(identificationQualifier);
  }

  public void setIdentificationReferences(String identificationReferences) {
    this.identificationReferences = norm(identificationReferences);
  }

  public void setIdentificationRemarks(String identificationRemarks) {
    this.identificationRemarks = norm(identificationRemarks);
  }

  public void setIdentificationVerificationStatus(String identificationVerificationStatus) {
    this.identificationVerificationStatus = identificationVerificationStatus;
  }

  public void setIdentifiedBy(String identifiedBy) {
    this.identifiedBy = norm(identifiedBy);
  }

  public void setIndividualCount(String individualCount) {
    this.individualCount = norm(individualCount);
  }

  public void setIsland(String island) {
    this.island = norm(island);
  }

  public void setIslandGroup(String islandGroup) {
    this.islandGroup = norm(islandGroup);
  }

  public void setLatestAgeOrHighestStage(String latestAgeOrHighestStage) {
    this.latestAgeOrHighestStage = latestAgeOrHighestStage;
  }

  public void setLatestEonOrHighestEonothem(String latestEonOrHighestEonothem) {
    this.latestEonOrHighestEonothem = latestEonOrHighestEonothem;
  }

  public void setLatestEpochOrHighestSeries(String latestEpochOrHighestSeries) {
    this.latestEpochOrHighestSeries = latestEpochOrHighestSeries;
  }

  public void setLatestEraOrHighestErathem(String latestEraOrHighestErathem) {
    this.latestEraOrHighestErathem = latestEraOrHighestErathem;
  }

  public void setLatestPeriodOrHighestSystem(String latestPeriodOrHighestSystem) {
    this.latestPeriodOrHighestSystem = latestPeriodOrHighestSystem;
  }

  public void setLifeStage(String lifeStage) {
    this.lifeStage = norm(lifeStage);
  }

  public void setLithostratigraphicTerms(String lithostratigraphicTerms) {
    this.lithostratigraphicTerms = lithostratigraphicTerms;
  }

  public void setLocality(String locality) {
    this.locality = norm(locality);
  }

  public void setLocationAccordingTo(String locationAccordingTo) {
    this.locationAccordingTo = locationAccordingTo;
  }

  public void setLocationID(String locationID) {
    this.locationID = norm(locationID);
  }

  public void setLocationRemarks(String locationRemarks) {
    this.locationRemarks = norm(locationRemarks);
  }

  public void setLowestBiostratigraphicZone(String lowestBiostratigraphicZone) {
    this.lowestBiostratigraphicZone = lowestBiostratigraphicZone;
  }

  public void setMaterialSampleID(String materialSampleID) {
    this.materialSampleID = materialSampleID;
  }

  public void setMaximumDepthInMeters(String maximumDepthInMeters) {
    this.maximumDepthInMeters = norm(maximumDepthInMeters);
  }

  public void setMaximumDistanceAboveSurfaceInMeters(String maximumDistanceAboveSurfaceInMeters) {
    this.maximumDistanceAboveSurfaceInMeters = norm(maximumDistanceAboveSurfaceInMeters);
  }

  public void setMaximumElevationInMeters(String maximumElevationInMeters) {
    this.maximumElevationInMeters = norm(maximumElevationInMeters);
  }

  public void setMember(String member) {
    this.member = member;
  }
  public void setMinimumDepthInMeters(String minimumDepthInMeters) {
    this.minimumDepthInMeters = norm(minimumDepthInMeters);
  }

  public void setMinimumDistanceAboveSurfaceInMeters(String minimumDistanceAboveSurfaceInMeters) {
    this.minimumDistanceAboveSurfaceInMeters = norm(minimumDistanceAboveSurfaceInMeters);
  }

  public void setMinimumElevationInMeters(String minimumElevationInMeters) {
    this.minimumElevationInMeters = norm(minimumElevationInMeters);
  }

  public void setMonth(String month) {
    this.month = norm(month);
  }

  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  public void setOccurrenceID(String occurrenceID) {
    this.occurrenceID = norm(occurrenceID);
  }

  public void setOccurrenceRemarks(String occurrenceRemarks) {
    this.occurrenceRemarks = norm(occurrenceRemarks);
  }

  public void setOccurrenceStatus(String occurrenceStatus) {
    this.occurrenceStatus = occurrenceStatus;
  }

  public void setOrganismID(String organismID) {
    this.organismID = norm(organismID);
  }

  public void setOrganismName(String organismName) {
    this.organismName = norm(organismName);
  }

  public void setOrganismRemarks(String organismRemarks) {
    this.organismRemarks = norm(organismRemarks);
  }

  public void setOrganismScope(String organismScope) {
    this.organismScope = norm(organismScope);
  }

  public void setOtherCatalogNumbers(String otherCatalogNumbers) {
    this.otherCatalogNumbers = norm(otherCatalogNumbers);
  }

  public void setPointRadiusSpatialFit(String pointRadiusSpatialFit) {
    this.pointRadiusSpatialFit = norm(pointRadiusSpatialFit);
  }

  public void setPreparations(String preparations) {
    this.preparations = norm(preparations);
  }

  public void setPreviousIdentifications(String previousIdentifications) {
    this.previousIdentifications = norm(previousIdentifications);
  }

  public void setRecordedBy(String recordedBy) {
    this.recordedBy = norm(recordedBy);
  }

  public void setRecordNumber(String recordNumber) {
    this.recordNumber = norm(recordNumber);
  }

  public void setReproductiveCondition(String reproductiveCondition) {
    this.reproductiveCondition = norm(reproductiveCondition);
  }

  public void setSamplingEffort(String samplingEffort) {
    this.samplingEffort = samplingEffort;
  }

  public void setSamplingProtocol(String samplingProtocol) {
    this.samplingProtocol = norm(samplingProtocol);
  }

  public void setSex(String sex) {
    this.sex = norm(sex);
  }

  public void setStartDayOfYear(String startDayOfYear) {
    this.startDayOfYear = norm(startDayOfYear);
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = norm(stateProvince);
  }

  public void setTypeStatus(String typeStatus) {
    this.typeStatus = norm(typeStatus);
  }

  public void setVerbatimCoordinates(String verbatimCoordinates) {
    this.verbatimCoordinates = norm(verbatimCoordinates);
  }

  public void setVerbatimCoordinateSystem(String verbatimCoordinateSystem) {
    this.verbatimCoordinateSystem = norm(verbatimCoordinateSystem);
  }

  public void setVerbatimDepth(String verbatimDepth) {
    this.verbatimDepth = norm(verbatimDepth);
  }

  public void setVerbatimElevation(String verbatimElevation) {
    this.verbatimElevation = norm(verbatimElevation);
  }

  public void setVerbatimEventDate(String verbatimEventDate) {
    this.verbatimEventDate = norm(verbatimEventDate);
  }

  public void setVerbatimLatitude(String verbatimLatitude) {
    this.verbatimLatitude = norm(verbatimLatitude);
  }

  public void setVerbatimLocality(String verbatimLocality) {
    this.verbatimLocality = norm(verbatimLocality);
  }

  public void setVerbatimLongitude(String verbatimLongitude) {
    this.verbatimLongitude = norm(verbatimLongitude);
  }

  public void setVerbatimSRS(String verbatimSRS) {
    this.verbatimSRS = verbatimSRS;
  }

  public void setWaterBody(String waterBody) {
    this.waterBody = norm(waterBody);
  }

  public void setYear(String year) {
    this.year = norm(year);
  }

}
